package com.it.day14.condition004;/**
 * Created by sunrise on 2018/10/31.
 */

/**
 * @ClassName MyThreadB
 * @Description 第二个线程执行b方法
 * @Author sunrise
 * @Date 2018/10/31 9:12
 * @Version 1.0
 */
public class MyThreadB  extends Thread {
    private MyService myService;
    public MyThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.awaitMethodB();
    }
}
