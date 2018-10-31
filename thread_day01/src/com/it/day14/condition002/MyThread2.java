package com.it.day14.condition002;/**
 * Created by sunrise on 2018/10/30.
 */

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/30 22:55
 * @Version 1.0
 */
public class MyThread2 extends Thread {
    private MyService2 myService;

    public MyThread2(MyService2 myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.await();
    }
}
