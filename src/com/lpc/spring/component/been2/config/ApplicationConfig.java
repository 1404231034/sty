package com.lpc.spring.component.been2.config;

import com.lpc.spring.component.been1.Role;
import com.lpc.spring.component.been2.serviceimpl.RoleServiceImpl;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {Role.class, RoleServiceImpl.class})
public class ApplicationConfig {
}
