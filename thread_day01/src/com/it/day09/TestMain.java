package com.it.day09;/**
 * Created by sunrise on 2018/10/16.
 */

/**
 * @ClassName TestMain
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/16 0:00
 * @Version 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        OutClass.InnerClass innerClass = new OutClass.InnerClass();
        InnerClass2 innerClass2 = new InnerClass2();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass.methodA();
            }
        },"a");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass.methodB(innerClass2);
            }
        },"b");
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.methodC();
            }
        },"c");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
