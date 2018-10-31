package com.it.day05;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 10:52
 * @Version 1.0
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.operateIMehtod();
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
