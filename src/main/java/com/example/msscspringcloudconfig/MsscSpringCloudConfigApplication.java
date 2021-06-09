package com.example.msscspringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsscSpringCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscSpringCloudConfigApplication.class, args);
    }

}
