package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//程序的主入口 不能删改
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //SpringApplication
        SpringApplication.run(DemoApplication.class, args);
    }

}
