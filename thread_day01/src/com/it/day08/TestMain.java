package com.it.day08;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName TestMain
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 21:21
 * @Version 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        Outher.Inner inner = new Outher.Inner();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"a");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"b");
        threadA.start();
        threadB.start();


    }
}
