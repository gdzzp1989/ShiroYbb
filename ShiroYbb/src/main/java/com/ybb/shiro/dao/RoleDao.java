package com.ybb.shiro.dao;

import com.ybb.shiro.entity.Role;
import org.apache.shiro.authz.permission.RolePermissionResolver;

import java.util.List;


public interface RoleDao {

    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();
}
