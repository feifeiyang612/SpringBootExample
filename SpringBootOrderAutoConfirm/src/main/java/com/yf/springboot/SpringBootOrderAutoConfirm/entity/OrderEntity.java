package com.yf.springboot.SpringBootOrderAutoConfirm.entity;

/**
 * @Author: YangFei
 * @Description:
 * @create: 2019-11-19 09:29
 */
public class OrderEntity {
    private String orderId;
    private int status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
