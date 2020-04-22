package com.king;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * created by king on 2020/4/21 5:34 下午
 */
@SpringBootApplication
@EnableZuulProxy
public class ZullMain9527 {
    public static void main(String[] args) {
            SpringApplication.run(ZullMain9527.class,args);
        }
}
