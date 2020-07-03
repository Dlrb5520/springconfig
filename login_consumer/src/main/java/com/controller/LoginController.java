package com.controller;

import com.ResponseData;
import com.feign.LoginFeign;
import com.login.sys_user;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/6/29
 * Time: 14:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginFeign LoginFeign;

    /**
     * 获取用户信息
     * produces = MediaType.APPLICATION_JSON_UTF8_VALUE  返回数据 为json 而不是xml
     * 或者 可以 排除 eureka-server 的 jackson-xml
     * @param username
     * @return
     */
    @GetMapping(value = "/getUserInfo/{username}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @HystrixCommand(fallbackMethod = "getBack")  //服务熔断@HystrixCommand
    public ResponseData getUserInfo(@PathVariable("username") String username){
        return this.LoginFeign.getUserInfo(username);
    }

    private ResponseData getBack(String username){
        return new ResponseData(500,"错误",null);
    }
}
