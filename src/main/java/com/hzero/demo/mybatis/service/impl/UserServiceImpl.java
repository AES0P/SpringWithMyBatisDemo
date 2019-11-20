package com.hzero.demo.mybatis.service.impl;

import com.hzero.demo.mybatis.dao.impl.UserDaoImpl;
import com.hzero.demo.mybatis.mapper.UserMapper;
import com.hzero.demo.mybatis.pojo.User;
import com.hzero.demo.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    //    @Autowired
    @Resource(name = "userDao")
    private UserDaoImpl userDao;

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public User findUserByIdBySqlSession(int userId) {
        return userDao.findUserByIdBySqlSession(userId);
    }

    @Override
    public void insertUsersBySqlSession(List<User> users) {
        userDao.insertUsersBySqlSession(users);
    }


    private  UserMapper userMapper;


}
