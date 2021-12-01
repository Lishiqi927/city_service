package com.xiaoqi.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    /**
     * 查找与用户相关的订单
     */
    @GetMapping("/findOrdersByUser/{id}")
    @HystrixCommand(fallbackMethod = "fallbackInfo")
    public String findOrdersByUser(@PathVariable String id){
        return this.restTemplate.getForObject("http://eureka-order/user/userList", String.class);
    }
    /**
     * 返回信息方法
     */
     public String fallbackInfo(@PathVariable String id){
         return "服务不可用，请稍后再试！";
     }
}
