package com.it.day08;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName Outher
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 21:10
 * @Version 1.0
 */
public class Outher {
    private static Object obj = new Object();

    static class Inner {
        public void method1() {
            synchronized (obj) {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " i=" + i);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        public void method2(){
            synchronized (this){
                for (int i = 11; i < 20; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" i = "+i);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
