package com.feign;

import order.OrderService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "order-product8002",fallbackFactory = OrderFallbackFactory.class)
public interface OrderFeign extends OrderService {
}
