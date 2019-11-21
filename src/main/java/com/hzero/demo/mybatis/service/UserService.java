package com.hzero.demo.mybatis.service;

import com.hzero.demo.mybatis.pojo.User;

import java.util.List;

public interface UserService {

    int insertUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    User findUserById(int id);

    List<User> findAllUser();

    User findUserByIdBySqlSession(int userId);

    void insertUsersBySqlSession(List<User> users);
}
