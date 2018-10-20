package com.it.day02;/**
 * Created by sunrise on 2018/10/14.
 */

import com.it.day03.HasSalfPrivateNum2;

/**
 * @ClassName ThreadB_2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/14 23:25
 * @Version 1.0
 */
public class ThreadB extends Thread {
    private HasSalfPrivateNum hasSalfPrivateNum;

    public ThreadB(com.it.day02.HasSalfPrivateNum hasSalfPrivateNum) {
        this.hasSalfPrivateNum = hasSalfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        try {
            hasSalfPrivateNum.addI("b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
