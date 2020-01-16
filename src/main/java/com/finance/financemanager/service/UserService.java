package com.finance.financemanager.service;


import com.finance.financemanager.common.BaseService;
import com.finance.financemanager.entity.User;
import com.finance.financemanager.mapper.UserMapper;
import com.finance.financemanager.utils.MD5Utils;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<UserMapper, User> {

    public User login(User user) {
        User userLogin = this.mapper.selectOne(user);
        if (MD5Utils.MD5(user.getUserPass()).equals(userLogin.getUserPass())) {
            userLogin.setUserPass(null);
            return userLogin;
        }
        throw new RuntimeException("密码错误");
    }

    public User register(User user) {
        user.setUserPass(MD5Utils.MD5(user.getUserPass()));
        this.mapper.insertSelective(user);
        user.setUserPass(null);
        return user;
    }
}
