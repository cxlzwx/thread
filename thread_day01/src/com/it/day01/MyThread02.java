package com.it.day01;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName MyThread02
 * @Description 线程停止，以及是否是停止的状态
 * @Author sunrise
 * @Date 2018/10/14 20:10
 * @Version 1.0
 */
public class MyThread02 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000; i++) {
            //判断当前线程是否是停止状态
            if (!this.isInterrupted()){
                System.out.println("已经是退出状态，我要退出了!");
                return;
            }
            System.out.println("i = "+i++);
        }
        System.out.println("我也输出，for循环虽然停止，但是线程并未停止");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread02 myThread02 = new MyThread02();
        myThread02.start();
        //主线程睡眠
        Thread.sleep(5000);
        //停止子线程
        myThread02.interrupt();
        //判断主线程是否是停止状态
        if (Thread.currentThread().isInterrupted()){
            System.out.println("main线程停止");
        }
        Thread.currentThread().interrupt();

    }
}
