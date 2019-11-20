package com.hzero.demo.mybatis.pojo;


/**
 * pojo:user
 *
 * 对应MySQL建表语句
 * CREATE TABLE `user` (
 * `id`  int(11) NOT NULL AUTO_INCREMENT ,
 * `name`  varchar(10) NOT NULL ,
 * `password`  varchar(16) NOT NULL ,
 * `address`  varchar(200) NULL ,
 * `phone`  varchar(20) NULL ,
 * PRIMARY KEY (`id`)
 * )
 * ;
 *
 */
public class User {

    private int id;

    private String name;

    private String password;

    private String address;

    private long phone;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}





