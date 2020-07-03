package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order.orderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao extends BaseMapper<orderInfo> {

    List<orderInfo> getOrder(@Param("OrderId") String OrderId);
}
