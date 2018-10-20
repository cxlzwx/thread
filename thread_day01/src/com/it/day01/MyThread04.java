package com.it.day01;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName MyThread04
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 21:35
 * @Version 1.0
 */
public class MyThread04 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("i = "+i+1);
        }
        try {
            System.out.println("run begin");
            Thread.sleep(20000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread04 myThread04 = new MyThread04();
        myThread04.start();
        //先停止线程，再休眠线程，抛出异常java.lang.InterruptedException
        myThread04.interrupt();
    }
}
