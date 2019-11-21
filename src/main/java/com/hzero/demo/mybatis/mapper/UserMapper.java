package com.hzero.demo.mybatis.mapper;

import com.hzero.demo.mybatis.pojo.User;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan(value = "userMapper")
public interface UserMapper {

    @Insert("insert into user( name, password, address, phone)" +
            "values( #{user.name}, #{user.password}, #{user.address}, #{user.phone})")
    @Options(keyProperty = "user.id", useGeneratedKeys = true)
    int insertUser(@Param("user") User user);

    @Delete("delete from user WHERE id = #{id}")
    int deleteUserById(@Param("id") int id);

    @Update("update user set " +
            "name=#{user.name}, password=#{user.password}, address=#{user.address}, phone=#{user.phone} " +
            "where id=#{user.id}")
    int updateUser(@Param("user") User user);

    @Select("SELECT * FROM user WHERE id = #{userId}")
    User findUserById(@Param("userId") int userId);

    @Select("select * from user")
//    @ResultMap("userMap")
    List<User> findAllUser();

}
