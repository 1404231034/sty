package com.lpc.reflect;

public class ReflectServiceImpl {
    public void sayHello(String name,String ee){
        System.err.println("hello"+name+" HI"+ee);
    }


    public ReflectServiceImpl(){

    }

    public ReflectServiceImpl(String s,String m){
        System.err.println(s+m);
    }

    public ReflectServiceImpl getInstance(){
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl)Class.forName("com.lpc.reflect.ReflectServiceImpl").newInstance();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            ex.printStackTrace();
        }
        return object;
    }
}
