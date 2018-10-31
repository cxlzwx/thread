package com.it.day14.condition002;/**
 * Created by sunrise on 2018/10/30.
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService2
 * @Description 正确使用condition
 * 业务类
 * @Author sunrise
 * @Date 2018/10/30 22:43
 * @Version 1.0
 */
public class MyService2 {
    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            //调用wait方法前先必须先获得对象监视器
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}
















