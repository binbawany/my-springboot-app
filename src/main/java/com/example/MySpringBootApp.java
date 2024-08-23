package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class MySpringBootApp {
    private static final Logger logger = LoggerFactory.getLogger(MySpringBootApp.class);

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApp.class, args);
        logger.info("Spring Boot application started with Log4j 2.18.0");
    }
}
