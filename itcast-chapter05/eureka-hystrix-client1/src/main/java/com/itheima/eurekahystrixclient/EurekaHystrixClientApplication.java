package com.itheima.eurekahystrixclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class EurekaHystrixClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixClientApplication.class, args);
    }

}
