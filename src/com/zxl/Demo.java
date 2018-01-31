package com.zxl;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class Demo {
	private static volatile int i = 0;

	
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		// int i =0;
		// System.err.println( ++i);
		for (int j = 0; j < 30; j++) {
			new Thread(() -> Demo.print()).start();
			new Thread(Demo::print).start();
			new Thread(demo::println).start();
		}
		// System.err.println( ++i);
		// String str =
		// "asdasdfasdfasdfasdfasdasdasdfasdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffasdf afasdf asdf asdfasdfasdf asdfasdf asdf asdf sdf  asdfasdfasdfasdfsa   sadfasdf ";
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//AtomicInteger
		//List<String> str = new ArrayList<String>();
		
		/*Lambda lambda = (a, b) -> {
			int a1 = (int)a;
			int b1 = (int)b;
			return Math.max(a1, b1);
		};
		 Lambda lam = lambda::abs;
		 
		System.out.println(lambda.abs(1, 2));*/
		
		Arrays.asList( "p", "k", "u","f", "o", "r","k").forEach( e -> System.out.println( e ) );
		
	}

	public synchronized static void print() {
		System.out.println(++i);
	}
	
	public void println() {
		Optional<Object> name = Optional.ofNullable(null);
		name.orElse("木有值呀!");
		
	}

}
