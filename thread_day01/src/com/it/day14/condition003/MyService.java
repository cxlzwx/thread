package com.it.day14.condition003;/**
 * Created by sunrise on 2018/10/30.
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description 使用condition配合lock完成线程间的通信
 * @Author sunrise
 * @Date 2018/10/30 23:47
 * @Version 1.0
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void methodAwait(){
        try {
            lock.lock();
            System.out.println("wait 时间为:"+System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    public void methodSignal(){
        try {
            lock.lock();
            System.out.println("signal 时间为:"+System.currentTimeMillis());
            condition.signal();
        } finally{
            lock.unlock();
        }

    }

}






