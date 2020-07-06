package com.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/6
 * Time: 16:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/config")
public class ConfigHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort(){
        return this.port;
    }
}
