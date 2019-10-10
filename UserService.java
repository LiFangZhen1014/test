package com.jtsj.spc.cloud.security2.service;


import com.jtsj.spc.cloud.security2.entity.User;
import com.jtsj.spc.starter.core.base.Service;
import org.springframework.stereotype.Component;


public interface UserService extends Service<User> {
    /**
     * 通过用户名或手机号查询用户
     *
     * @param username 用户名或手机
     * @return User
     */
    User getUserByUsername(String username);

    /**
     * 登录错误记录登录错误次数
     *
     * @param userId 用户ID
     */
    void loginFail(Long userId);

    /**
     * 登录成功清除登录错误次数
     *
     * @param userId 用户ID
     */

}
