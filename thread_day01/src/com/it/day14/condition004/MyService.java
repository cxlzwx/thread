package com.it.day14.condition004;/**
 * Created by sunrise on 2018/10/31.
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description 业务类:使用从condition实现通知所有线程执行
 * @Author sunrise
 * @Date 2018/10/31 8:58
 * @Version 1.0
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void  awaitMethodA(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" 开始等待的时间为:"+System.currentTimeMillis());
            //当前线程开始等待,并释放锁
            condition.await();
            System.out.println(Thread.currentThread().getName()+" 结束等待时间为:"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void  awaitMethodB(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" 开始等待的时间为:"+System.currentTimeMillis());
            condition.await();
            System.out.println(Thread.currentThread().getName()+" 结束等待时间为:"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void sigalMethod(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" signal时间为:"+System.currentTimeMillis());
            condition.signalAll();
        }finally{
            lock.unlock();
        }
    }

}












