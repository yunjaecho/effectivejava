package com.yunjae.effective.singleton;

/**
 * In the second approach to implementing singletons, the public member is a static factory method:
 */
public class Elvis2 {
    private static final Elvis2 instance = new Elvis2();

    private Elvis2() {}

    public static Elvis2 getInstance() {
        return instance;
    }
}
