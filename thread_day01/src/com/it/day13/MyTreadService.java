package com.it.day13;/**
 * Created by sunrise on 2018/10/30.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyTreadService
 * @Description  rentrantlock的基本使用
 * @Author sunrise
 * @Date 2018/10/30 22:18
 * @Version 1.0
 */
public class MyTreadService {
    private Lock lock = new ReentrantLock();
    public void  printl(){
        //进入代码前先获得锁对象
        lock.lock();
        for (int i = 0; i < 5; i++) {
            try {
                //sleep方法并不是释放锁对象
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"执行,获得锁对象");
        }
        //执行完代码释放锁对象
        lock.unlock();
    }
}
