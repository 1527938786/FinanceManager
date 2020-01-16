package com.finance.financemanager.service;


import com.finance.financemanager.entity.User;
import com.finance.financemanager.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    UserMapper mapper;


    public List<User> selectList() {

        PageHelper.startPage(1, 2);
        return this.mapper.selectAll();
    }
}
