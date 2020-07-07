package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/7
 * Time: 9:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.dao")
@EnableHystrixDashboard
public class LoginProduct8003Application {
    public static void main(String[] args) {
        SpringApplication.run(LoginProduct8003Application.class,args);
    }
}
