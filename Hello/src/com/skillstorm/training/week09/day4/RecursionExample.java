package com.skillstorm.training.week09.day4;

public class RecursionExample {
	public static void main(String[] args) {
		hello(10);
		System.out.println(getFib(4));
		System.out.println(factorial(2));
	}

	public static void hello(int times) {

		if (times > 0) {
			System.out.println("hi");
			hello(times - 1);
		}
		
	}

	public static int getFib(int n) {
		System.out.println("n = " + n);
		if (n < 2) // base case
			return n; // if n is 0 return 0 and if n is 1 return 1
		return getFib(n - 1) + getFib(n - 2); // if n is 2 or more return the sum of the previous 2 values
	}
	// factorial example: 5! = 5 * 4 * 3 * 2 * 1
	// factorial(5) = 5 * factorial(4) only true for n > 1
	// factorial(n -1) = (n - 1) * factorial(n-2)
	// factorial(0) = 1 BASE CASE
	public static long factorial(long n) {
		if (n == 0)
		return 1;
		else 
			return n * factorial(n - 1);
	}
	
}
