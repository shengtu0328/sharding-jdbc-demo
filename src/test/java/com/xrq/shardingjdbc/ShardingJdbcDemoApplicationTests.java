package com.xrq.shardingjdbc;


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

}
