package com.xworkz.example;

public class FibonacciWithWhileLoop {
	
	public static void main(String[] args) {
		printFibonacci(10);
	}
	
	static void printFibonacci(int limit) {
		int a=0;
		int b=1;
		int i=1;
		while(limit>i) {
			System.out.print(a+"\t");
			int sum=a+b;
			a=b;
			b=sum;
			i++;
		}
	}

}
