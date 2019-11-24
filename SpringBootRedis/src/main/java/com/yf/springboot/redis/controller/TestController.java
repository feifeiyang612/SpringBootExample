package com.yf.springboot.redis.controller;

import com.yf.springboot.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @Author: YangFei
 * @Description:
 * @create: 2019-11-25 00:13
 */
@RestController
public class TestController {
    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/redis")
    public String testRedis() {
        // 访问地址http://127.0.0.1:8080/redis   ， 如果输出“信不信由你”说明成功了
        Object myTest = redisUtil.get("myTest");
        if (null != myTest) {
            return myTest.toString();
        }
        return null;
    }

    @PostConstruct
    public void init() {
        redisUtil.set("myTest", "信不信由你");
    }
}

