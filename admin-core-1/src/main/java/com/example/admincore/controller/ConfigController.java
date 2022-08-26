
package com.example.admincore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.nacos.api.config.annotation.NacosValue;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    
    @Value("${useLocalCache}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get(){
        return useLocalCache;
    }
}
