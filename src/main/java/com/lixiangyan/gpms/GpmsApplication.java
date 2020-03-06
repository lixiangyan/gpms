package com.lixiangyan.gpms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lixiangyan.dao")
public class GpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpmsApplication.class, args);
    }

}
