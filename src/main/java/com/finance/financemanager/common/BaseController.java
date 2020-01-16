package com.finance.financemanager.common;


import com.finance.financemanager.common.Api;
import com.finance.financemanager.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<S extends BaseService, E> {

    @Autowired
    protected S service;

    @GetMapping
    private Api<E> selectList() {
        List<E> list = service.selectAll();
        return Api.ok(list);
    }

    @GetMapping("/{id}")
    public Api<E> selectById(@PathVariable Object id) {
        return Api.ok(service.selectByPrimaryKey(id));
    }

    @PostMapping
    public Api<E> create(@RequestBody E e) {
        return Api.ok(service.insert(e));
    }

    @PutMapping("/{id}")
    public Api<E> updateById(@PathVariable Object id, @RequestBody E e) {
        service.updateByPrimaryKeySelective(e);
        return Api.ok(e);
    }


    @DeleteMapping("/{id}")
    public Api<E> updateById(@PathVariable Object id) {
        service.delete(id);
        return Api.ok();
    }
}
