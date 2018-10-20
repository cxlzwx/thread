package com.it.day05;/**
 * Created by sunrise on 2018/10/15.
 */

/**
 * @ClassName Sub
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/15 10:46
 * @Version 1.0
 */
public class Sub extends Man {
    @Override
    public synchronized void operateIMehtod() {
        super.operateIMehtod();
        while (i>0){
            try {
                i--;
                System.out.println("sub i ="+i);
                Thread.sleep(100);
                this.operateIMehtod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
