package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("goods")
public class Goods implements Serializable {

    private int id ;

    private String gname;

    private BigDecimal gprice;

    private int gsave;

    private String ginfo;

    private String gimage;

    private int status;
    @TableField("create_time")
    private Date createTime;

    private int tid;
}
