package com.p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by a on 2017/12/16.
 */
@ComponentScan(basePackages = {"com.p2p"})
@MapperScan("com.p2p.mapper")
@SpringBootApplication
public class BackgroudApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackgroudApplication.class);
    }
}
