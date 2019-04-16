package com.lpc.spring.component.been2.test;

import com.lpc.spring.component.been1.Role;
import com.lpc.spring.component.been2.config.ApplicationConfig;
import com.lpc.spring.component.been2.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeen2 {
    public static void main(String[] args){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Role role = ctx.getBean(Role.class);
        RoleService roleService = ctx.getBean(RoleService.class);
        //这里使用service和serviceImpl都可以，使用类去获取been，框架会判断装配得所有bean是否是
        //该类得实例，遍历结束后如果有该类得实例，便返回，
        //RoleService roleService = ctx.getBean(RoleServiceImpl.class);
        roleService.printRoleInfo(role);
    }
}
