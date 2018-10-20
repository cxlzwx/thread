package com.it.day04;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 10:25
 * @Version 1.0
 */
public class ThreadA extends Thread{
    private PublicVal publicVal;

    public ThreadA(PublicVal publicVal){
        this.publicVal = publicVal;
    }

    @Override
    public void run() {
        super.run();
        try {
            publicVal.setValue("b","bb");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
