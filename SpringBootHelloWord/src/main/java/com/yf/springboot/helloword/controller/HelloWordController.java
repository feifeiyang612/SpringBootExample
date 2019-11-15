package com.yf.springboot.helloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YangFei
 * @Description: SpringBoot之HelloWord测试程序
 * @create: 2019-11-15 13:47
 */

@RestController
public class HelloWordController {

    @RequestMapping("/hello")
    public String index(){
        System.out.println("Spring Boot Hello Word!");
        return "Spring Boot Hello Word!";
    }

}
