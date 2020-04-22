package com.king.controller;

import com.king.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Customer {
//    private static final String REST_URL_PREFIX = "http://localhost:8001/";
    private static final String REST_URL_PREFIX = "http://DEPT-PROVIDER/";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/customer/dept/add", method = RequestMethod.GET)
    public boolean add( Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "dept/add", dept,Boolean.class);
    }

    @RequestMapping(value = "/customer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/get/"+id, Dept.class);
    }

    @RequestMapping(value = "/customer/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/list", List.class);
    }
}
