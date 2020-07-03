package com.feign;

import login.LoginService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "login-product8001",fallbackFactory = LoginFallbackFactory.class)
public interface LoginFeign extends LoginService {

}
