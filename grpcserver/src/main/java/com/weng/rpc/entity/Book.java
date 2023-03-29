package com.weng.rpc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("booklist")
public class Book implements Serializable {
    private String id;
    private String name;
}
