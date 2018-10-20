package com.it.day03;/**
 * Created by sunrise on 2018/10/14.
 */

/**
 * @ClassName ThreadB_2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 23:25
 * @Version 1.0
 */
public class ThreadB_2 extends Thread {
    private HasSalfPrivateNum2 hasSalfPrivateNum2;

    public ThreadB_2(HasSalfPrivateNum2 hasSalfPrivateNum2) {
        this.hasSalfPrivateNum2 = hasSalfPrivateNum2;
    }

    @Override
    public void run() {
        super.run();
        try {
            hasSalfPrivateNum2.addI("b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
