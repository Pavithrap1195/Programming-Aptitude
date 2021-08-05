package com.xworkz.example;

public class FindFactorial {
	
	public static void main(String[] args) {
		printFactorial(5);
	}
	
	static int printFactorial(int num) {
		int n=1;
		for (int i = 1; i <= num; i++) {
			n=n*i;
			
		}
		System.out.println(n);
		return n;
	}

}
