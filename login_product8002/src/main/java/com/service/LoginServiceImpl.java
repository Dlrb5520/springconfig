package com.service;

import com.ResponseData;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.LoginDao;
import com.login.sys_user;
import login.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/6/29
 * Time: 9:26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
@RestController
public class LoginServiceImpl extends ServiceImpl<LoginDao, sys_user> implements LoginService {

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    @Override
    public ResponseData getUserInfo(String username) {
        return new ResponseData(200,"",this.baseMapper.selectById(username));
    }
}
