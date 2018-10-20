package com.it.day01;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName MyThread05
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 22:10
 * @Version 1.0
 */
public class MyThread05 extends Thread {
    @Override
    public void run() {
        super.run();
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            count += i;
            //使用yield方法使线程放弃cup的运行权，耗时明显增多
            Thread.yield();
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-start)+"毫秒");
    }

    public static void main(String[] args) {
        MyThread05 myThread05 = new MyThread05();
        myThread05.start();
    }
}
