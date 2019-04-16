package com.lpc.spring.start1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springonce.xml");
        JuiceMaker2 juiceMaker2 = (JuiceMaker2)ctx.getBean("juiceMaker2");
        System.out.println ( juiceMaker2.makeJuice ());
        ctx.close();
    }
}
