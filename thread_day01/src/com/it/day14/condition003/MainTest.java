package com.it.day14.condition003;/**
 * Created by sunrise on 2018/10/31.
 */


/**
 * @ClassName MainTest
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/31 0:15
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        Thread thread = new Thread(new ThreadA(service));
        thread.start();
        Thread.sleep(1000);
        service.methodSignal();

    }
}
