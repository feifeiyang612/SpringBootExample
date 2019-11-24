package com.yf.springboot.SpringBootOrderAutoConfirm.delay;


//超时出队的监听

public interface OnDelayedListener<T extends BaseDelayed> {

    public void onDelayedArrived(T delayed);
}
