package com.it.day13;/**
 * Created by sunrise on 2018/10/30.
 */

/**
 * @ClassName MainTest
 * @Description 测试类
 * @Author sunrise
 * @Date 2018/10/30 22:25
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        MyTreadService service = new MyTreadService();
        Thread t1 = new MyThread(service);
        Thread t2 = new MyThread(service);
        Thread t3 = new MyThread(service);
        Thread t4 = new MyThread(service);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
