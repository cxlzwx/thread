package com.it.day14.condition005;/**
 * Created by sunrise on 2018/10/31.
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description 不同线程获得不同的condition,多路复用
 * @Author sunrise
 * @Date 2018/10/31 17:18
 * @Version 1.0
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    public void methodA(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" 等待时间:"+System.currentTimeMillis());
            condition1.await();
            System.out.println(Thread.currentThread().getName()+" 结束时间:"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
    public void methodB(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" 等待时间:"+System.currentTimeMillis());
            condition2.await();
            System.out.println(Thread.currentThread().getName()+" 结束时间:"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    public void signalMethodA(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" signal时间为:"+System.currentTimeMillis());
            condition1.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void signalMethodB(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" signal时间为:"+System.currentTimeMillis());
            condition2.signalAll();
        }finally {
            lock.unlock();
        }
    }

}
