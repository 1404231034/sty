package com.lpc.inteceptor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InteceptorJdkProxy implements InvocationHandler {

    private Object target;
    private String inteceptorClass = null;
    public InteceptorJdkProxy(Object target,String inteceptorClass){
        this.target = target;
        this.inteceptorClass = inteceptorClass;
    }

    public static Object bind(Object target,String inteceptorClass){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InteceptorJdkProxy(target,inteceptorClass));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(inteceptorClass == null){
            return method.invoke(target,args);
        }

        Object result = null;
        Inteceptor inteceptor = (Inteceptor)Class.forName(inteceptorClass).newInstance();

        if(inteceptor.before(proxy,target,method,args)){
            result = method.invoke(target,args);
        }else {
            inteceptor.around(proxy,target,method,args);
        }

        inteceptor.after(proxy,target,method,args);
        return result;
    }
}
