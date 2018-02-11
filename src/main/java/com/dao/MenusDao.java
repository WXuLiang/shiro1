package com.dao;

import java.util.Set;

/**
 *权限数据层接口
 * @author Created  by wxl on 2018/2/3 0003.
 */
public interface MenusDao {

    /**
     * 根据用户名查找权限
     * @param username
     * @return
     */
    Set<String> findPermissions(String username);
}
