package com.it.day01;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName MyThread03
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 21:11
 * @Version 1.0
 */
public class MyThread03 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(5000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread03 myThread03 = new MyThread03();
        myThread03.start();
        Thread.sleep(2000);
        //睡眠状态下停止线程出现java.lang.InterruptedException
        myThread03.interrupt();

    }
}
