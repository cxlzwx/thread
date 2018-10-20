package com.it.day06;/**
 * Created by sunrise on 2018/10/15.
 */

import javax.swing.plaf.synth.SynthDesktopIconUI;

/**
 * @ClassName Service
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 14:55
 * @Version 1.0
 */
public class Service {
    synchronized public static void printA() throws InterruptedException {
        System.out.println("线程 :"+Thread.currentThread().getName()+" 开始A方法");
        Thread.sleep(2000);
        System.out.println("线程 :"+Thread.currentThread().getName()+" 结束A方法");
    }
    synchronized public void printB() throws InterruptedException {
        System.out.println("线程 :"+Thread.currentThread().getName()+" 开始B方法");
        Thread.sleep(2000);
        System.out.println("线程 :"+Thread.currentThread().getName()+" 结束B方法");
    }
}












