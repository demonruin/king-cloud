package com.king.contorller;

import com.king.entity.Dept;
import com.king.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by king on 2020/2/26 5:05 下午
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
//    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

}
