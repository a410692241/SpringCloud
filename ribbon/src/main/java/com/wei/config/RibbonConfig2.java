package com.wei.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@NoComponed
public class RibbonConfig2 {

    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}