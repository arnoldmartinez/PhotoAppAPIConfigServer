package com.appsdeveloperblog.photoapp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PhotoApiConfigServerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(PhotoApiConfigServerApplication.class, args);
    }
}
