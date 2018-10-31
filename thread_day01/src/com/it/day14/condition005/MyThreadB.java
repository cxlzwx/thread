package com.it.day14.condition005;/**
 * Created by sunrise on 2018/10/31.
 */

/**
 * @ClassName MyThreadB
 * @Description 线程b
 * @Author sunrise
 * @Date 2018/10/31 22:42
 * @Version 1.0
 */
public class MyThreadB extends Thread {
    private MyService myService;

    public MyThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.methodB();
    }
}
