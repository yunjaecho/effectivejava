package com.yunjae.effective.singleton;

public class Elvis {
    public static final Elvis instance = new Elvis();

    private int count;
    private Elvis() {
        count++;
        if (count != 1) {
            throw new IllegalStateException("this object should be singleton");
        }
    }
}
