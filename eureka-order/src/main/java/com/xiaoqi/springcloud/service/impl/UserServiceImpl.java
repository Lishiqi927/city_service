package com.xiaoqi.springcloud.service.impl;

import com.xiaoqi.springcloud.mapper.UserMapper;
import com.xiaoqi.springcloud.po.User;
import com.xiaoqi.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    //注入用户Mapper
    @Autowired
    private UserMapper userMapper;
    //查询所有用户
    public List<User> getAllUsers() {
        return this.userMapper.getAllUsers();
    }
    //删除用户
    public void deleteUser(Integer id) {
        System.out.println("删除了id为"+id+"的用户");
        this.userMapper.delete(id);
    }
}
