package com.lpc.spring.component.been2.serviceimpl;

import com.lpc.spring.component.been1.Role;
import com.lpc.spring.component.been2.service.RoleService;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRoleInfo(Role role) {
        System.err.println("id = " + role.getId());
        System.err.println("name = " + role.getName());
        System.err.println("note = " + role.getNote());
    }
}
