package com.alekseysamoylov.learn.discovery.client.learnclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LearnClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnClientApplication.class, args);
    }
}
