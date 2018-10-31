package com.it.day14.condition005;/**
 * Created by sunrise on 2018/10/31.
 */

/**
 * @ClassName MyThreadA
 * @Description 线程A
 * @Author sunrise
 * @Date 2018/10/31 22:40
 * @Version 1.0
 */
public class MyThreadA extends Thread {
    private MyService myService;

    public  MyThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.methodA();
    }
}
