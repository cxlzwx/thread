package com.it.day07;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 17:21
 * @Version 1.0
 */
public class ThreadA extends Thread {

    private DieSynchronized dieSynchronized;
    private Object obj1;
    private Object obj2;

    public ThreadA(DieSynchronized dieSynchronized,Object obj1,Object obj2){
        this.dieSynchronized =dieSynchronized;
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        super.run();
        dieSynchronized.printWait(obj1,obj2);
    }
}
