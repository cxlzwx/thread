package com.it.day14.condition004;/**
 * Created by sunrise on 2018/10/31.
 */

/**
 * @ClassName MainTest
 * @Description 测试类
 * @Author sunrise
 * @Date 2018/10/31 9:15
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        Thread threada = new MyThreadA(myService);
        Thread threadb = new MyThreadB(myService);
        threada.start();
        threadb.start();
        Thread.sleep(2000);
        myService.sigalMethod();

    }
}
