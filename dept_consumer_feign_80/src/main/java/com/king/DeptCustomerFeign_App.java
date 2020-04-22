package com.king;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * created by king on 2020/2/27 3:31 下午
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.king"})
//@ComponentScan("com.king")
public class DeptCustomerFeign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptCustomerFeign_App.class,args);
    }
}
