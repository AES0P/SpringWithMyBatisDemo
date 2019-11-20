package com.hzero.demo.mybatis.service;

import com.hzero.demo.mybatis.pojo.User;

import java.util.List;

public interface UserService {

    User findUserById(int id);

    User findUserByIdBySqlSession(int userId);

    void insertUsersBySqlSession(List<User> users);
}
