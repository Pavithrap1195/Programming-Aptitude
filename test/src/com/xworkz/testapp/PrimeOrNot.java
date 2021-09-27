package com.xworkz.testapp;

public class PrimeOrNot {

	static int primeOrNotPrime(int num) {
		boolean isPrime=false;
		for (int i = 2; i <=num/2 ;i++) {
			if(num%i==0) {
				isPrime=true;
			}
		}
			if(isPrime==true) {
				primeOrNotPrime(num);
			System.out.println(num+" Not a prime number");
			}else if(isPrime==false) {
				System.out.println(num+" Prime number");
			}
			//primeOrNotPrime(num);
		return 0;	
		}

}
