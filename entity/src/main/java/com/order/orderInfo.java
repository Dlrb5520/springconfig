package com.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/2
 * Time: 14:19
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@TableName("goods_order")
@Data
@AllArgsConstructor //有参构造
@NoArgsConstructor  //无参构造
@Accessors(chain = true) //支持链式访问
public class orderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    @TableId(value = "orderid",type = IdType.INPUT)  //主键
    private String orderId;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    /**
     * 用户id
     */
    @TableField(value = "userid")
    private String userId;

}
