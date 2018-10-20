package com.it.day01;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 19:37
 * @Version 1.0
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000; i++) {
            System.out.println("i = "+i+1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();
        System.out.println("当前线程是否停止："+ myThread.isInterrupted());
        System.out.println("main是否停止："+Thread.interrupted());
    }
}
