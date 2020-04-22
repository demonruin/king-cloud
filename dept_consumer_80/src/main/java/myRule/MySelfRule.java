package myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by king on 2020/3/3 4:51 下午
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new MyRuleDiy_king();
//        return new RandomRule_ZY();
    }
}
