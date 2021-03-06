package com.LambdaExp.Examples;



public class LambdaExp {

	@FunctionalInterface
	interface lambda {
		int operation(int x, int y);
	}

	private int operate(int x, int y, lambda l1) {
		return l1.operation(x, y);
	}
	
	public static void main(String[] args) {
		LambdaExp obj = new LambdaExp();
		lambda add = (int a, int b) -> a+b;

		System.out.println(obj.operate(3, 4, add));
	}

}