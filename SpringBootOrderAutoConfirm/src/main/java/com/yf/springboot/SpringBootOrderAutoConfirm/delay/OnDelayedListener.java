package com.yf.springboot.SpringBootOrderAutoConfirm.delay;

public interface OnDelayedListener<T extends BaseDelayed> {

    public void onDelayedArrived(T delayed);
}
