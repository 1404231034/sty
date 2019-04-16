package com.lpc.spring.component.been1.test;

import com.lpc.spring.component.been1.PojoConfig;
import com.lpc.spring.component.been1.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMian {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(PojoConfig.class);
        Role role = (Role)context.getBean("role");
        System.err.println(role.getId());
    }
}
