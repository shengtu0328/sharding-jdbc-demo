package com.xrq.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xrq.shardingjdbc.entity.Course;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * @author 又坏又迷人
 * 公众号: Java菜鸟程序员
 * @date 2020/11/19
 * @Description: mapper
 */
@Repository
@MapperScan("com.xrq.shardingjdbc.mapper")
public interface CourseMapper extends BaseMapper<Course> {

}