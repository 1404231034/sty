package com.lpc.mybatis.mapper;

import com.lpc.mybatis.pojo.Role;

import java.util.List;

public interface RoleMapper {
    int insertRole(Role role);
    int deleteRole(String id);
    int updateRole(Role role);
    List<Role> list();
}
