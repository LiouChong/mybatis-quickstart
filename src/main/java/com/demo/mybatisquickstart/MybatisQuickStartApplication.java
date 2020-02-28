package com.demo.mybatisquickstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.demo.mybatisquickstart.dao")
public class MybatisQuickStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisQuickStartApplication.class, args);
    }

}
