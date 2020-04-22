package com.king.controller;

import com.king.entity.Dept;
import com.king.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Customer {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/customer/dept/add", method = RequestMethod.GET)
    public boolean add(Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/customer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/customer/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }
}
