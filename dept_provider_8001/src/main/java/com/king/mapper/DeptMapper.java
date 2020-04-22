package com.king.mapper;

import com.king.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * created by king on 2020/2/26 4:36 下午
 */
@Mapper
public interface DeptMapper {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
