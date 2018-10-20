package com.it.day10;/**
 * Created by sunrise on 2018/10/16.
 */

/**
 * @ClassName StringPrint2
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/16 13:10
 * @Version 1.0
 */
public class StringPrint2 implements Runnable{
    private boolean isContinuePrint = true;

    @Override
    public void run() {
        while (isContinuePrint){
            System.out.println(Thread.currentThread().getName()+" 进入方法");
        }
        System.out.println(Thread.currentThread().getName()+" 方法执行完毕");
    }
    public static void main(String[] args) throws InterruptedException {
        StringPrint2 stringPrint2 = new StringPrint2();
        Thread thread = new Thread(stringPrint2);
        thread.start();
//        Thread.sleep(3000);
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                stringPrint2.isContinuePrint = false;
//            }
//        });
//        t2.start();

//        while (true){
            stringPrint2.isContinuePrint = false;
//        }
        Thread.sleep(2000);
    }
}
