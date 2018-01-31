package com.zxl;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo2 {
	private static  int i = 0;
	private static AtomicInteger atomicInteger = new AtomicInteger(0);
	public static void main(String[] args) {
		long time = System.nanoTime();
		for (int j = 0; j < 100; j++) {
			new Thread(() -> Demo2.print()).start();
			
		}
		System.err.println(System.nanoTime()-time);
		time = System.nanoTime();
		for (int j = 0; j < 10000; j++) {
			new Thread(() -> Demo2.print2()).start();
			
		}
		System.err.println(System.nanoTime()-time);
	}
	public static void print() {
		System.out.println(++i);
	}
	public static void print2(){
		atomicInteger.incrementAndGet();
	}
}
