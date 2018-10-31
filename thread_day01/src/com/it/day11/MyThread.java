package com.it.day11;/**
 * Created by sunrise on 2018/10/16.
 */

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/16 17:52
 * @Version 1.0
 */
public class MyThread extends Thread {
    private static volatile int count = 0;

    public void countVolatile() {
        for (int i = 0; i < 100; i++){
            count++;
        }
        System.out.println("count = "+count);
    }

    @Override
    public void run() {
        countVolatile();
    }
}
