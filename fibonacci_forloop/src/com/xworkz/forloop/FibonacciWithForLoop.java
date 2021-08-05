package com.xworkz.forloop;

public class FibonacciWithForLoop {
	
	public static void main(String[] args) {
		printFibonacci(10,0,1);
	}
	
	static void printFibonacci(int limit,int a,int b) {
		
		for (int i = 0; i<limit ; i++) {
			int sum=a+b;
			System.out.print(a+"\t");
			a=b;
			b=sum;
			
			
		}
		
	}

}
