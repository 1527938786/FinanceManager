package com.finance.financemanager.common;


import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public abstract class BaseService<M extends CommonMapper<E>, E> {
    @Autowired
    protected M mapper;

    public List<E> selectAll() {
        return mapper.selectAll();
    }

    public E selectByPrimaryKey(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    public E insert(E e) {
        mapper.insertSelective(e);
        return e;
    }

    public void updateByPrimaryKey(E e) {
        mapper.updateByPrimaryKey(e);
    }

    public void updateByPrimaryKeySelective(E e) {
        mapper.updateByPrimaryKeySelective(e);
    }

    public void delete(Object id) {
        mapper.deleteByPrimaryKey(id);
    }
}
