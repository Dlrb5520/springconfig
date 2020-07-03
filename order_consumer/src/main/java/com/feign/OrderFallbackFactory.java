package com.feign;

import com.ResponseData;
import feign.hystrix.FallbackFactory;
import order.OrderService;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/2
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component //不要忘记  千万不要忘记
public class OrderFallbackFactory implements FallbackFactory<OrderFeign> {
    @Override
    public OrderFeign create(Throwable throwable) {
        return new OrderFeign(){
            @Override
            public ResponseData getOrder(String OrderId) {
                return new ResponseData(200,"主人出错了",null);
            }

            @Override
            public ResponseData test(String OrderId) {
                return new ResponseData(200,"主人出错了",null);
            }
        };
    }
}
