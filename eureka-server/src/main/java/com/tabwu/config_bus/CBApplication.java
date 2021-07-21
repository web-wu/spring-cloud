package com.tabwu.config_bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CBApplication {
    public static void main(String[] args) {
        SpringApplication.run(CBApplication.class,args);
    }
}
