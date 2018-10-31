package com.it.day14.condition003;/**
 * Created by sunrise on 2018/10/30.
 */

/**
 * @ClassName ThreadA
 * @Description 线程1执行等待方法等待线程
 * @Author sunrise
 * @Date 2018/10/30 23:57
 * @Version 1.0
 */
public class ThreadA implements Runnable {

    private MyService myService;

    public ThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodAwait();
    }
}
