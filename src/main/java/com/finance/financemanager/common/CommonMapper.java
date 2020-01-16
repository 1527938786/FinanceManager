package com.finance.financemanager.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

public interface CommonMapper<E> extends Mapper<E>, SelectByExampleMapper<E> {
}
