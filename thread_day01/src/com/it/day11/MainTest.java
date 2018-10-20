package com.it.day11;/**
 * Created by sunrise on 2018/10/16.
 */

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/16 18:04
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new MyThread().start();
        }
    }
}
