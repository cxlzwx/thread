package com.it.day14.condition005;/**
 * Created by sunrise on 2018/10/31.
 */

/**
 * @ClassName MaintTest
 * @Description 测试类,通过condition唤醒指定线程组
 * @Author sunrise
 * @Date 2018/10/31 22:43
 * @Version 1.0
 */
public class MaintTest {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThreadA myThreadA = new MyThreadA(myService);
        myThreadA.setName("t1");
        myThreadA.start();
        MyThreadB myThreadB = new MyThreadB(myService);
        myThreadB.setName("t2");
        myThreadB.start();
        Thread.sleep(1000 );
        myService.signalMethodA();

    }
}
