package com.p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

/**
 * Created by a on 2017/12/16.
 */
@MapperScan("com.p2p.mapper")
@ComponentScan(basePackages = {"com.p2p"})
@SpringBootApplication
public class FrontApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrontApplication.class);
    }
}
