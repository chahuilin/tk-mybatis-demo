package com.example.tkmybatisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.example.tkmybatisdemo.mapper")
public class TkMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMybatisDemoApplication.class, args);
    }

}
