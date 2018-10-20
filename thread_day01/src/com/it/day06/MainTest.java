package com.it.day06;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 15:24
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        Thread.sleep(5000);
    }
}
