package com.service;

import java.util.Set;

/**
 * @author Created  by wxl on 2018/2/1 0001.
 */
public interface UserService {

    /**
     * 查找用户的所有角色
     * @param username
     * @return
     */
    Set<String> findRolesByUserName(String username);

    /**
     * 查找用户的所有权限
     * @param username
     * @return
     */
    Set<String> findPermissions(String username);
}
