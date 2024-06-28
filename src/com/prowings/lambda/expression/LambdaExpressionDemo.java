package com.prowings.lambda.expression;


interface Runneble{
	
public void run();

}

//class My_Practice implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("Running in a thread");
//	}
//	
//}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
//		Runnable r1 = new My_Practice();
//		r1.run();
		Runnable runnable = () -> System.out.println("Running in a thread");
		
		new Thread(runnable).start();
	}
}