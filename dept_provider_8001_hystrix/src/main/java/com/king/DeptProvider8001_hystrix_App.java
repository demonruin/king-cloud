package com.king;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * created by king on 2020/2/26 5:16 下午
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DeptProvider8001_hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_hystrix_App.class, args);
    }
}

