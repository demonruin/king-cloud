package com.king;

import myRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * created by king on 2020/2/27 3:31 下午
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="DEPT-PROVIDER",configuration = MySelfRule.class)
//@RibbonClient(name="dept-provider",configuration = MySelfRule.class)
public class DeptCustomer_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptCustomer_App.class,args);
    }
}
