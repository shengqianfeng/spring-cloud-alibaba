package com.alibaba.cloud.dubbo.bootstrap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/11/25 4:34 下午
 * @Author jeff.sheng
 */
@RestController
@RequestMapping
public class HealthCheckController {

    @GetMapping(value = "/hello")
    public String healthCheck(){
        return "hello,world";
    }
}
