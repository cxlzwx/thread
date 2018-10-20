package com.it.day05;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName Man
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 10:44
 * @Version 1.0
 */
public class Man {
    protected int i = 10;

    synchronized public void operateIMehtod() {
        try {
            i--;
            System.out.println("man i =" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
