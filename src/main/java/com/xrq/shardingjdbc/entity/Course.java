package com.xrq.shardingjdbc.entity;

import lombok.Data;

/**
 * @author 又坏又迷人
 * 公众号: Java菜鸟程序员
 * @date 2020/11/19
 * @Description: Course实体类
 */
@Data
public class Course {

    private Long cid;
    private String cname;
    private Long userId;
    private String status;

}