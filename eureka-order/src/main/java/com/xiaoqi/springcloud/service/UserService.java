package com.xiaoqi.springcloud.service;

import com.xiaoqi.springcloud.po.User;

import java.util.List;

public interface UserService {
    //查询所有
    List<User> getAllUsers();
    //删除数据
    void deleteUser(Integer id);
}
