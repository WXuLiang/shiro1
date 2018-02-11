package com.service.impl;

import com.dao.MenusDao;
import com.dao.RolesDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Created  by wxl on 2018/2/1 0001.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RolesDao rolesDao;

    @Autowired
    private MenusDao menusDao;


    /**
     * 查找用户的所有角色
     * @param username
     * @return
     */
    @Override
    public Set<String> findRolesByUserName(String username) {
        Set<String> roles =        rolesDao.findAllRolesByUserName(username);
        return roles;
    }

    @Override
    public Set<String> findPermissions(String username) {
        Set<String> menus = menusDao.findPermissions(username);
        return menus;
    }
}
