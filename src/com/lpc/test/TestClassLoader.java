package com.lpc.test;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestClassLoader {

//    private static final Logger logger = Logger.getLogger(TestClassLoader.class);
//    PropertyConfigurator.configure("log4j2.properties");

    public static void main(String[] a){


        ClassLoader c = TestClassLoader.class.getClassLoader();
//        logger.info(c);
        System.out.println(c);
        ClassLoader c1 = c.getParent();
//        logger.info(c1);
        System.out.println(c1);
        ClassLoader c2 = c1.getParent();
//        logger.info(c2);
        System.out.println(c2);

    }
}
