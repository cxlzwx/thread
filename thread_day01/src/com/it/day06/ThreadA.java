package com.it.day06;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 15:06
 * @Version 1.0
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        try {
            service.printA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
