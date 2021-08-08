package com.xworkz.apti;

public class PrimeFactor {
	
	public static void main(String[] args) {
		printPrimeFactor(18);
	}
	
	static void printPrimeFactor(int num) {
		for(int i=2;i<num;i++) {
			while(num%i==0) {
				num=num/i;
				System.out.println(i);
			}
		}
		System.out.println(num);
	}

}
