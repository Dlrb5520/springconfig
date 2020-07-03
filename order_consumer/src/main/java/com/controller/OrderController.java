package com.controller;

import com.ResponseData;
import com.feign.OrderFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/2
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderFeign orderfeign;

    @PostMapping(value = "/getOrder",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseData getOrder(@RequestParam String OrderId){
        System.out.println("OrderId=="+OrderId);
        return  orderfeign.getOrder(OrderId);
    }

    @GetMapping(value = "/test/{OrderId}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @HystrixCommand(fallbackMethod = "error")
    public ResponseData test(@PathVariable("OrderId") String OrderId){
        System.out.println("OrderId=="+OrderId);

        return  orderfeign.test(OrderId);
    }

    public ResponseData error(String OrderId){
        return new ResponseData(500,"失败",1);
    }
}
