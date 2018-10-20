package com.it.day02;/**
 * Created by sunrise on 2018/10/14.
 */

import com.it.day03.ThreadA_2;

/**
 * @ClassName MainTest2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 23:27
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        HasSalfPrivateNum privateNum = new HasSalfPrivateNum();
        ThreadA threadA = new ThreadA(privateNum);
        threadA.start();
        ThreadB threadB = new ThreadB(privateNum);
        threadB.start();
    }
}
