package com.finance.financemanager.common;


import com.finance.financemanager.common.Api;
import com.finance.financemanager.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<S extends BaseService, E> {

    @Autowired
    private S s;

    @GetMapping
    private Api<E> selectList() {
        List<E> list = s.selectAll();
        return Api.ok(list);
    }

    @GetMapping("/{id}")
    public Api<E> selectById(@PathVariable Object id) {
        return Api.ok(s.selectByPrimaryKey(id));
    }

    @PostMapping
    public Api<E> create(@RequestBody E e) {
        return Api.ok(s.insert(e));
    }

    @PutMapping("/{id}")
    public Api<E> updateById(@PathVariable Object id, @RequestBody E e) {
        s.updateByPrimaryKeySelective(e);
        return Api.ok(e);
    }


    @DeleteMapping("/{id}")
    public Api<E> updateById(@PathVariable Object id) {
        s.delete(id);
        return Api.ok();
    }
}
