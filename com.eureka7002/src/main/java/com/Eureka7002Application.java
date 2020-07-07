package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/7
 * Time: 9:13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class Eureka7002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Application.class,args);
    }
}
