package com.example.admincore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdminCore2Application {
    public static void main(String[] args) {
        SpringApplication.run(AdminCore2Application.class, args);
    }

}
