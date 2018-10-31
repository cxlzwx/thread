package com.it.day11;

public class test {
	public static void main(String[] args) {
		People p = new People();
		Thread a = new MyThread2(p, 1);
		Thread b = new MyThread2(p, 2);
		a.start();
		b.start();
	}
}

class People{
	
	public synchronized void a() {
		for(int i=0;i<50;i++) {
			System.out.print("A");
		}
	}
	public synchronized void b() {
		for(int i=0;i<50;i++) {
			System.out.print("B");
		}
	}
}
class MyThread2 extends Thread{
	People p;
	volatile int c;
	MyThread2(People p,int c){
		this.p = p;
		this.c = c;
	}
	@Override
	public void run() {
	     if(c == 1) p.a();
	     
	     p.b();
	}
}