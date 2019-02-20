package com.lpc.test;

import com.lpc.reflect.ReflectServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试反射功能
 * 2019年2月19日
 */
public class TestReflect {
    public static void main(String[] a){
        try {
            //反射无参构造方法创建实例
            ReflectServiceImpl o = (ReflectServiceImpl) Class.forName("com.lpc.reflect.ReflectServiceImpl").newInstance();
            o.sayHello(" www");

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ReflectServiceImpl k = new ReflectServiceImpl();
        try {
            //反射有参方法
            Method method = ReflectServiceImpl.class.getMethod("sayHello", String.class);
            method.invoke(k," lpc");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            //反射有参数的构造方法
            ReflectServiceImpl p =
                    (ReflectServiceImpl)Class.forName("com.lpc.reflect.ReflectServiceImpl")
                            .getConstructor(String.class,String.class).newInstance("why","lulu");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
