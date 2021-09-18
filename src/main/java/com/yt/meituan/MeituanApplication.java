package com.yt.meituan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.yt.meituan.mapper")
@SpringBootApplication
public class MeituanApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeituanApplication.class, args);
    }

}
