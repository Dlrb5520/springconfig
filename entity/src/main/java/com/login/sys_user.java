package com.login;

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
 * Date: 2020/6/28
 * Time: 17:38
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_user")
public class sys_user implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账号
     */
    @TableId(value = "account",type = IdType.INPUT)  //主键
    private long account;

    /**
     * 用户名称
     */
    @TableField(value = "username")
    private String username;

    /**
     * 用户密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createtime;

    /**
     * 部门id
     */
    @TableField(value = "dept_id")
    private Integer deptid;

    /**
     * 用户状态
     */
    @TableField(value = "status")
    private Integer status;


    /**
     * 数据名称
     */
    @TableField(value = "datasourcename")
    private String datasourcename;

}
