package com.hzero.demo.mybatis.dao.impl;

import com.hzero.demo.mybatis.dao.UserDao;
import com.hzero.demo.mybatis.mapper.UserMapper;
import com.hzero.demo.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    //通过MapperFactoryBean操作
//    @Resource(name = "userMapper")
    @Autowired
    //不知道为什么，使用自动扫描后，这里指定Resource或者Autowired idea都会报错：找不到对应bean，但运行时不会抛出异常
    private UserMapper userMapper;

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }


    //通过SqlSessionTemplateBean操作
    @Resource(name = "sqlSessionTemplate")
    private SqlSession sqlSessionTemplate;

    public User findUserByIdBySqlSession(int userId) {
        return sqlSessionTemplate.selectOne("com.hzero.demo.mybatis.mapper.UserMapper.findUserById", userId);
    }

    public void insertUsersBySqlSession(List<User> users) {
//        for (User user : users) {
//            sqlSessionTemplate.insert("com.hzero.demo.mybatis.mapper.UserMapper.insertUser", user);
//        }
    }

}
