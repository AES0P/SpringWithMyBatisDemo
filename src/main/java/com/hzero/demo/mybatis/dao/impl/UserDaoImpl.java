package com.hzero.demo.mybatis.dao.impl;

import com.hzero.demo.mybatis.dao.UserDao;
import com.hzero.demo.mybatis.mapper.UserMapper;
import com.hzero.demo.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    //通过userMapper操作
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public User findUserById(int userId) {
        return userMapper.findUserById(userId);
    }


    //通过sqlSession操作
    @Resource(name = "sqlSession")
    private SqlSession sqlSession;

    public User findUserByIdBySqlSession(int userId) {
        return sqlSession.selectOne("com.hzero.demo.mybatis.mapper.UserMapper.findUserById", userId);
    }

    public void insertUsersBySqlSession(List<User> users) {
        for (User user : users) {
            sqlSession.insert("com.hzero.demo.mybatis.mapper.UserMapper.insertUser", user);
        }
    }

}
