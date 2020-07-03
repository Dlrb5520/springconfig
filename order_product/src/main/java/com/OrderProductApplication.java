package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/2
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.dao")
public class OrderProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderProductApplication.class);
    }
}
