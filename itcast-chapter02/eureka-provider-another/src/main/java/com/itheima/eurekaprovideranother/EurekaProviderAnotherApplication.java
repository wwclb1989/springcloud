package com.itheima.eurekaprovideranother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderAnotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderAnotherApplication.class, args);
    }

}
