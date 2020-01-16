package com.finance.financemanager.mapper;

import com.finance.financemanager.entity.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

public interface UserMapper extends Mapper<User>, SelectByExampleMapper<User> {
}

