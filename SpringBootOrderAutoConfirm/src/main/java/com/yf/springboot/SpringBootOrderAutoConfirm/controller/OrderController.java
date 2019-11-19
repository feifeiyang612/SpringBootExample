package com.yf.springboot.SpringBootOrderAutoConfirm.controller;

import com.yf.springboot.SpringBootOrderAutoConfirm.service.DelayedOrder;
import com.yf.springboot.SpringBootOrderAutoConfirm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YangFei
 * @Description:
 * @create: 2019-11-19 09:02
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/create")
    public String createOrder(@RequestParam("orderId") String orderId) {
        DelayedOrder order = orderService.createOrder(orderId);
        return order.getValue();
    }

    @GetMapping("/pay")
    public Boolean payOrder(@RequestParam("orderId") String orderId) {
        boolean ret = orderService.payOrder(orderId);
        return ret;
    }
}
