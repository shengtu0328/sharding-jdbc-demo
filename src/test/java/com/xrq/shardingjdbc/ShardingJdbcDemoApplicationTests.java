package com.xrq.shardingjdbc;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xrq.shardingjdbc.entity.Course;
import com.xrq.shardingjdbc.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcDemoApplicationTests {


    @Autowired
    private CourseMapper courseMapper;

    //添加课程
    @Test
    public void addCourse() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            //cid由我们设置的策略，雪花算法进行生成
            course.setCname("Java");
            course.setUserId(100L);
            course.setStatus("Normal");
            courseMapper.insert(course);
        }

    }


    //添加课程
    @Test
    public void page1() {


        Page<Course> ipage = new Page<>(2, 3);


        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("user_id", 100);
        IPage<Course> result = courseMapper.page1(ipage,queryWrapper);
        System.out.println(result);
    }

    @Test
    public void page2() {


        Page<Course> ipage = new Page<>(2, 3);


        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("user_id", 100);
        IPage<Course> result = courseMapper.selectPage(ipage,queryWrapper);
        System.out.println(result);
    }


}
