package com.github.vermucht.smth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {RepositoryRestMvcAutoConfiguration.class})
public class SmthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmthApplication.class, args);
    }

}
