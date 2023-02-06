package com.xrq.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xrq.shardingjdbc.entity.Course;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

    @Select("select * " +
            " from course " +
            " ${ew.customSqlSegment}")
    Page<Course> page1(Page<Course> dtoPage, @Param(Constants.WRAPPER) Wrapper<Course> wrapper);

}