package com.it.day07;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName DieSynTest
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 17:21
 * @Version 1.0
 */
public class DieSynTest {
    public static void main(String[] args) throws InterruptedException {
        DieSynchronized aSynchronized = new DieSynchronized();
        Object o1 = new Object();
        Object o2 = new Object();
        ThreadA threadA = new ThreadA(aSynchronized,o1,o2);
        threadA.start();
        ThreadB threadB = new ThreadB(aSynchronized,o1,o2);
        threadB.start();
    }
}
