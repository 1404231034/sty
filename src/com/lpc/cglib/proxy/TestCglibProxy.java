package com.lpc.cglib.proxy;

import com.lpc.cglib.proxy.CglibProxyExample;
import com.lpc.reflect.ReflectServiceImpl;

public class TestCglibProxy {

    public static void main(String[] a){
        CglibProxyExample cglibProxyExample = new CglibProxyExample();

        ReflectServiceImpl reflectService = (ReflectServiceImpl) cglibProxyExample.getProxy(ReflectServiceImpl.class);

        reflectService.sayHello("lpc","lec");
    }
}
