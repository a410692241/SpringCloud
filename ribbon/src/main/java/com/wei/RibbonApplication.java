package com.wei;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.wei.config.NoComponed;
import com.wei.config.RibbonConfig;
import com.wei.config.RibbonConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
//针对该微服务
@RibbonClients({@RibbonClient(name = "第一个负载均衡策略",configuration = RibbonConfig.class),
        @RibbonClient(name = "第二个负载均衡策略",configuration = RibbonConfig2.class)})
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,value = NoComponed.class))

public class RibbonApplication {
    /*针对不同的服务配置不同的负载均衡策略*/
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

}
