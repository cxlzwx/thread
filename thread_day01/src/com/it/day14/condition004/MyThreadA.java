package com.it.day14.condition004;/**
 * Created by sunrise on 2018/10/31.
 */

/**
 * @ClassName MyThreadA
 * @Description  第一个线程执行A方法
 * @Author sunrise
 * @Date 2018/10/31 9:10
 * @Version 1.0
 */
public class MyThreadA extends Thread {
    private MyService myService;
    public MyThreadA(MyService myService){
        this.myService = myService;
    }
    @Override
    public void run() {
        super.run();
        myService.awaitMethodA();
    }
}
