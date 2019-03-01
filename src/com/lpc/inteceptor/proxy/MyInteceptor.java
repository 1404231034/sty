package com.lpc.inteceptor.proxy;

import java.lang.reflect.Method;

public class MyInteceptor implements Inteceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法前逻辑");
        return false;   //返回false，不反射被代理对象原有方法
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("取代了被代理对象的方法");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法后逻辑");
    }
}
