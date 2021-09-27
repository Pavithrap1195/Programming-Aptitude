package com.xworkz.testapp;

public class Tester {
	
	public static void main(String[] args) {
		
		short numbers[] = {12,43,126,34,25,64,43,11,1,45,87,78,56,3};
		Sorting.sortArray(numbers);
		
		System.out.println();
		System.out.println("======================================");
		System.out.println();
		
		short num[] = {12,43,126,34,25,64,43,11,1,45,87,78,56,3};
		int number = 87;
		Searching.search(num, number);
		
		System.out.println();
		System.out.println("======================================");
		System.out.println();
		
		PrimeOrNot.primeOrNotPrime(10);
		
		//Pattern.diamond(5);
		
	}

}
