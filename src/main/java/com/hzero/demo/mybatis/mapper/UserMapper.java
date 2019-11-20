package com.hzero.demo.mybatis.mapper;

import com.hzero.demo.mybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{userId}")
    User findUserById(@Param("userId") int userId);

    @Insert("insert into user value( name = #{name}  )")
    void insertUser(@Param("user") User user);

}
