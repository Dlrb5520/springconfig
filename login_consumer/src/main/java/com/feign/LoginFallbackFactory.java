package com.feign;

import com.ResponseData;
import feign.hystrix.FallbackFactory;
import login.LoginService;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/6/29
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component //不要忘记   服务降级
public class LoginFallbackFactory implements FallbackFactory<LoginFeign> {
    @Override
    public LoginFeign create(Throwable throwable) {
        return new LoginFeign(){

            @Override
            public ResponseData getUserInfo(String username) {
                return new ResponseData(500,"系统内部错误",null);
            }
        };
    }
}
