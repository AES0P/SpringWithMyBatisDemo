package com.hzero.demo.mybatis.dao;

import com.hzero.demo.mybatis.pojo.User;

import java.util.List;

public interface UserDao {

    User findUserById(int userId);

    User findUserByIdBySqlSession(int userId);

    void insertUsersBySqlSession(List<User> users);

}
