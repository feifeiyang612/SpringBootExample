package com.yf.springboot.SpringBootOrderAutoConfirm.service;

import com.yf.springboot.SpringBootOrderAutoConfirm.delay.BaseDelayed;

/**
 * @Author: YangFei
 * @Description:
 * @create: 2019-11-19 09:05
 */
public class DelayedOrder extends BaseDelayed<String> {
    /**
     * 默认过期时间是30分钟
     */
    private static int timeout = 30 * 60;

    public DelayedOrder() {
    }

    public DelayedOrder(String orderId) {
        super(timeout, orderId);
    }

    public DelayedOrder(int timeoutSeconds, String orderId) {//TODO 测试用
        super(timeoutSeconds, orderId);
    }
}
