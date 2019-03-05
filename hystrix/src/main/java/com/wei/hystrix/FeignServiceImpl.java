package com.wei.hystrix;

import com.wei.bo.User;
import com.wei.bo.UserExample;
import com.wei.controller.FeignSerivice;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignServiceImpl implements FeignSerivice {
    @Override
    public Object getAll(UserExample userExample) {
        return "进入默认的feign与hystrix配置的类之中!~";
    }
}
