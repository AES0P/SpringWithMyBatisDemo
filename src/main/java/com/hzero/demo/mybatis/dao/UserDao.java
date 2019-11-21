package com.hzero.demo.mybatis.dao;

import com.hzero.demo.mybatis.pojo.User;

import java.util.List;

public interface UserDao {


    int insertUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    User findUserById(int userId);

    List<User> findAllUser();

    User findUserByIdBySqlSession(int userId);

    void insertUsersBySqlSession(List<User> users);

}
