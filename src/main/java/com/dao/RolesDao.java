package com.dao;

import java.util.Set;

/**
 * @author Created  by wxl on 2018/2/1 0001.
 */
public interface RolesDao {
    /**
     * 根据用户名查找用户的所有角色
     * @param userName
     * @return
     */
    Set<String> findAllRolesByUserName(String userName);
}
