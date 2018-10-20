package com.it.day09;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName OutClass
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 23:43
 * @Version 1.0
 */
public class OutClass {

    static class InnerClass {
        synchronized public void methodA() {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + " i=" + i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

       public void methodB(InnerClass2 innerClass2) {
           synchronized(innerClass2){
               for (int j = 0; j < 10; j++) {
                   try {
                       System.out.println(Thread.currentThread().getName() + " j=" + j);
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
        }


    }
}