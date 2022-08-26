package com.example.admincore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderProviderTest")
@RefreshScope
public class OrderProviderTest {
    // 配置相关后面会介绍到
    @Value("${user.name:test}")
    private String name;
    // 配置相关后面会介绍到
    @Value("${user.age:1000}")
    private String age;

    @GetMapping("/test")
    public String test() {
        return "order 服務的返回的數據" + age + name;
    }
}