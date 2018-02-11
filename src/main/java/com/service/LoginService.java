package com.service;

import com.entities.UserBean;

/**
 * @author Created  by wxl on 2018/2/1 0001.
 */
public interface LoginService {
    /**
     * 判断用户名是否存在
     * @param userName
     * @return
     */
    UserBean isExist(String userName);
}
