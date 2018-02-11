package com.service.impl;

import com.dao.UserDao;
import com.entities.UserBean;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Created  by wxl on 2018/2/1 0001.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    /**
     * 判断用户名是否存在
     * @param userName
     * @return
     */
    @Override
    public UserBean isExist(String userName) {
        UserBean userBean = userDao.isExist(userName);
        return userBean;
    }
}
