package com;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/6/30
 * Time: 9:57
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableHystrixDashboard //开启监控
public class HystrixDashboradApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboradApplication.class);
    }


}
