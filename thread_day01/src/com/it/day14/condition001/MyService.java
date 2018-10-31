package com.it.day14.condition001;/**
 * Created by sunrise on 2018/10/30.
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService2
 * @Description 不正确使用condition
 * 业务类
 * @Author sunrise
 * @Date 2018/10/30 22:43
 * @Version 1.0
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void await(){
        try {
            /*
            启动项目会报错java.lang.IllegalMonitorStateException
              Before waiting on the condition the lock must be held by the
             * current thread.
             */
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
















