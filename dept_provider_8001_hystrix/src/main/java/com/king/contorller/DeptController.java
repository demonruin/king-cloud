package com.king.contorller;

import com.king.entity.Dept;
import com.king.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "HystrixFallBack")
    public Dept get(@PathVariable("id") long id) {
        Dept dept = deptService.get(id);
        if(dept==null){
            throw new RuntimeException();
        }
        return dept;
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    public Dept HystrixFallBack(@PathVariable("id") long id){
        return new Dept().setDeptno(id).setDname("hystrix").setDb_source("fallback");
    }
}
