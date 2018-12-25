package me.wanq.wadmin.service;

import me.wanq.wadmin.entity.system.User;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("单元测试开始之前执行初始化");
        System.out.println("-----------------------");

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
    }

    @Before
    public void beforeTest() {
        System.out.println("单元测试方式开始之前执行......");
    }


    @After
    public void afterTest() {
        System.out.println("单元测试方法结束后执行......");

    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("-----------------------");
        System.out.println("单元测试结束之后执行初始化");
    }


}
