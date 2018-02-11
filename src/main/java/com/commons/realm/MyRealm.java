package com.commons.realm;

import com.entities.UserBean;
import com.service.LoginService;
import com.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Created  by wxl on 2018/1/31 0031.
 */
public class MyRealm extends AuthorizingRealm {


    @Autowired
    private LoginService loginService;

    @Autowired
    private UserService userService;

    /*
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.findRolesByUserName(username));
        authorizationInfo.setStringPermissions(userService.findPermissions(username));
        System.out.println(userService.findPermissions(username));
        return authorizationInfo;
    }

    /*
     * 登录验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        //2. 从 UsernamePasswordToken 中来获取 username
        String username = token.getUsername();
        //3.判断用户名是否存在，若存在，返回user对象
        UserBean user = loginService.isExist(username);
        if (user != null){
            return new SimpleAuthenticationInfo(username, user.getPassword(), getName());
        }else{
            throw new AuthenticationException("用户名不存在");
        }
    }
}

