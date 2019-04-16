package com.lpc.spring.elexp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ELBeanTest {
    public static void main(String[] args){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Role role = ctx.getBean(Role.class);
        ELBean elBean = ctx.getBean(ELBean.class);

        System.out.println(role.getId()+ "sdfsdf" +elBean.getId());
    }
}
