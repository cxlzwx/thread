package com.it.day10;/**
 * Created by sunrise on 2018/10/16.
 */

/**
 * @ClassName StringPrint
 * @Description TODO
 * @Author sunrise
 * @Date 2018/10/16 13:05
 * @Version 1.0
 */
public class StringPrint {
    private boolean isCountinuePrint = true;

    public boolean isCountinuePrint() {
        return isCountinuePrint;
    }

    public void setCountinuePrint(boolean countinuePrint) {
        isCountinuePrint = countinuePrint;
    }
    public void printStringMethod(){
        while (isCountinuePrint){
            try {
                System.out.println(Thread.currentThread().getName()+"运行");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束运行");
    }

    public static void main(String[] args) throws InterruptedException {
        StringPrint stringPrint = new StringPrint();
        //死循环
        new Thread(new Runnable() {
            @Override
            public void run() {
                stringPrint.printStringMethod();
            }
        }).start();

        Thread.sleep(2000);
        stringPrint.setCountinuePrint(false);
        while (true) {
        }
    }
}
