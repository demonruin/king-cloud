package com.king.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * created by king on 2020/2/27 5:27 下午
 */
@Configuration
public class RestTemplateBean {

    @Bean
    public IRule myRule(){
//        return new RoundRobinRule();
        return new RandomRule();//将默认 轮训 改成 随机
//        return new RetryRule();//没有失败的就等于轮训 如果有挂掉的服务，就先尝试请求，如果不通过，再过滤分隔跳过请求
    }
}
