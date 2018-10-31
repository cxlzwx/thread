package com.it.day14.condition001;/**
 * Created by sunrise on 2018/10/30.
 */


/**
 * @ClassName MainTest
 * @Description 测试类
 * @Author sunrise
 * @Date 2018/10/30 22:58
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread t1 = new MyThread(myService);
        t1.start();
    }
}
