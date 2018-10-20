package com.it.day09;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName InnerClass2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 23:56
 * @Version 1.0
 */
public class InnerClass2 {
    synchronized public void methodC(){
        for (int k = 0; k < 10; k++) {
            try {
                System.out.println(Thread.currentThread().getName()+" k ="+k);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
