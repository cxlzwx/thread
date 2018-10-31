package com.it.day13;/**
 * Created by sunrise on 2018/10/30.
 */

/**
 * @ClassName MyThread2
 * @Description 线程类
 * @Author sunrise
 * @Date 2018/10/30 22:21
 * @Version 1.0
 */
public class MyThread  extends Thread{
    private MyTreadService myTreadService;

    public MyThread(MyTreadService myTreadService){
        this.myTreadService = myTreadService;
    }

    @Override
    public void run() {
        super.run();
        myTreadService.printl();
    }
}
