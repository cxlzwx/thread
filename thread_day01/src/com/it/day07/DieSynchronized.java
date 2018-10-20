package com.it.day07;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName DieSynchronized
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 17:16
 * @Version 1.0
 */
public class DieSynchronized {

    public int i = 0;

    public void printWait(Object obj1,Object obj2){
        if (i==0){
            synchronized (obj1){
                try {
                    System.out.println(Thread.currentThread().getName()+" 进入代码1");
                    i=1;
                    Thread.sleep(3000);
                    synchronized (obj2){
                        System.out.println(Thread.currentThread().getName()+" 进入代码2");
                        Thread.sleep(3000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else {
            synchronized (obj2){
                try {
                    System.out.println(Thread.currentThread().getName()+" 进入代码1");
                    i=0;
                    Thread.sleep(3000);
                    synchronized (obj1){
                        System.out.println(Thread.currentThread().getName()+" 进入代码2");
                        Thread.sleep(3000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
