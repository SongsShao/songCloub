package com.songshao.mybatisPlus.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.songshao.mybatisplus.*.mapper")
@EnableAsync
@RestController
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication sApp= new SpringApplication(StartApplication.class);
        sApp.run(args);
    }

}