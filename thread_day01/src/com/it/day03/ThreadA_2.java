package com.it.day03;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName ThreadA_2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 23:16
 * @Version 1.0
 */
public class ThreadA_2 extends Thread {
    private HasSalfPrivateNum2 hasSalfPrivateNum2;

    public ThreadA_2(HasSalfPrivateNum2 hasSalfPrivateNum2){
        this.hasSalfPrivateNum2 = hasSalfPrivateNum2;
    }

    @Override
    public void run() {
        super.run();
        try {
            hasSalfPrivateNum2.addI("a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
