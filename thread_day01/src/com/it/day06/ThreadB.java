package com.it.day06;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName ThreadB
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 15:19
 * @Version 1.0
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        try {
            service.printB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
