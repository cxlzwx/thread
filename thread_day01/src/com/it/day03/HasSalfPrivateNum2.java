package com.it.day03;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName HasSalfPrivateNum2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 23:11
 * @Version 1.0
 */
public class HasSalfPrivateNum2 {

    //多线程下访问实例变量会发生线程安全问题
    private int num = 0;

    public synchronized void addI(String username) throws InterruptedException {
        if ("a".equals(username)) {
            num = 100;
            System.out.println("a set over");
            Thread.sleep(2000);
        } else {
            num = 200;
            System.out.println("b set over");
        }
        System.out.println(username + " num = " + num);
    }
}












