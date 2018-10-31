package com.it.day14.condition001;/**
 * Created by sunrise on 2018/10/30.
 */

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/30 22:55
 * @Version 1.0
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.await();
    }
}
