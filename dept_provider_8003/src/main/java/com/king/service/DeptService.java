package com.king.service;


import com.king.entity.Dept;

import java.util.List;

/**
 * created by king on 2020/2/26 4:59 下午
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
