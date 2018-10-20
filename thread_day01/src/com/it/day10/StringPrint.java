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
    }

    public static void main(String[] args) {
        StringPrint stringPrint = new StringPrint();
        //死循环
        stringPrint.printStringMethod();
        stringPrint.setCountinuePrint(false);
    }
}
