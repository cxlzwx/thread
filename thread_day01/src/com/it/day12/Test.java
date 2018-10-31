package com.it.day12;


public class Test {
  public synchronized void method1(){
    System.out.println("hello method1");
    System.out.println("hello method1");
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
  public synchronized void method2(){
    System.out.println("hello world 2");
    System.out.println("hello method1");

  }



  public static void main(String[] args){
    Test test = new Test();

    new Thread(new Runnable() {
      public void run() {
        System.out.println("进入线程1");
        test.method1();
      }
    }).start();

    new Thread(new Runnable() {
      public void run() {
        System.out.println("jinruxianchenger22");
        test.method2();
      }
    }).start();

  }
}