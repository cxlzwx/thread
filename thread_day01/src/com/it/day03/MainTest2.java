package com.it.day03;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName MainTest2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 23:27
 * @Version 1.0
 */
public class MainTest2 {
    public static void main(String[] args) {
        HasSalfPrivateNum2 privateNum = new HasSalfPrivateNum2();
        ThreadA_2 threadA = new ThreadA_2(privateNum);
        threadA.start();
        ThreadB_2 threadB = new ThreadB_2(privateNum);
        threadB.start();
    }
}
