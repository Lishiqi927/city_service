package com.xiaoqi.springcloud.controller;

import com.xiaoqi.springcloud.po.Order;
import com.xiaoqi.springcloud.util.ServiceInfoUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    /*
    * 通过id查询订单
    * */
    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id){
        Order order = new Order();
        order.setId("123");
        order.setPrice(23.5);
        order.setReceiverAddress("beijing");
        order.setReceiverName("xiaoqi");
        order.setReceiverPhone("15800000000");
        return order.toString();
    }
}
