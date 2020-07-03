package com.service;

import com.ResponseData;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.OrderDao;
import com.order.orderInfo;
import order.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/2
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
@RestController
public class OrderServiceImpl extends ServiceImpl<OrderDao, orderInfo> implements OrderService {


    @Override
    public ResponseData getOrder(String OrderId) {
        System.out.println("OrderId=="+OrderId);
        return new  ResponseData(200,"成功",this.baseMapper.getOrder(OrderId));
    }

    @Override
    public ResponseData test(String OrderId) {
        System.out.println("OrderId === test"+OrderId);
        return new  ResponseData(200,"成功",2);
        //return null;
    }
}
