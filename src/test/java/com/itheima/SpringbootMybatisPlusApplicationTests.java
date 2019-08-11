package com.itheima;

import com.itheima.dao.MybatisPlusTest;
import com.itheima.domain.User;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusApplicationTests {
    @Autowired
    MybatisPlusTest mybatisPlusTest;
    @Test
    public void contextLoads() {
        User user = mybatisPlusTest.selectById(1);
        System.out.println("user = " + user);
    }

}
