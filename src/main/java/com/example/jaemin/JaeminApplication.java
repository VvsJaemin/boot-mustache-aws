package com.example.jaemin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JaeminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaeminApplication.class, args);
    }

}
