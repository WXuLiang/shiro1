package com.controller;

import com.entities.UserBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Created  by wxl on 2018/1/31 0031.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(UserBean userBean){
        UsernamePasswordToken token = new UsernamePasswordToken(userBean.getUserName(), userBean.getPassword());
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()){
            //使用shiro来验证
            token.setRememberMe(true);
            currentUser.login(token);//验证角色和权限
        }

        return "success";
    }
}
