package com.king.service.impl;

import com.king.entity.Dept;
import com.king.mapper.DeptMapper;
import com.king.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * created by king on 2020/2/26 5:01 下午
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {

        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {

        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {

        return deptMapper.findAll();
    }
}
