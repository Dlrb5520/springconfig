package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/6/28
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.dao")
@EnableHystrixDashboard
public class LoginProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoginProductApplication.class);
    }
}
