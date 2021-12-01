package com.xiaoqi.springcloud.mapper;

import com.xiaoqi.springcloud.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
   //查询所有用户
   @Select("select * from tb_user")
   List<User> getAllUsers();
   //删除用户
    @Delete("delete from tb_user where id=#{id}")
    void delete(Integer id);
}
