package com.it.day04;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 10:28
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        PublicVal publicVal = new PublicVal();
        ThreadA threadA = new ThreadA(publicVal);
        threadA.start();
        Thread.sleep(2000);
        publicVal.getValue();
    }
}
