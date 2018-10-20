package com.it.day02;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName ThreadA_2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 23:16
 * @Version 1.0
 */
public class ThreadA extends Thread {
    private HasSalfPrivateNum hasSalfPrivateNum;

    public ThreadA(HasSalfPrivateNum hasSalfPrivateNum){
        this.hasSalfPrivateNum = hasSalfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        try {
            hasSalfPrivateNum.addI("a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
