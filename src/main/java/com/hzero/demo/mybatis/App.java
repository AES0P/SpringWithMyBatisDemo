package com.hzero.demo.mybatis;

import com.hzero.demo.mybatis.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {

        UserServiceImpl userService = (UserServiceImpl) new ClassPathXmlApplicationContext("applicationContext.xml")
                .getBean("userService");

        System.out.println(userService.findUserById(1).getName());
        System.out.println(userService.findUserByIdBySqlSession(1).getName());
    }
}
