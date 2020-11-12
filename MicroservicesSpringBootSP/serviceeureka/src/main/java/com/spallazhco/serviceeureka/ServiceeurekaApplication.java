package com.spallazhco.serviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceeurekaApplication.class, args);
    }

}
