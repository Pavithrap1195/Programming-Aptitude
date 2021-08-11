package com.xworkz.example;

import java.util.Scanner;

public class Task10Aug {
	
	public static void main(String[] args) {
		additionOfOddSeries();
		
		
	}
		
	public static void additionOfOddSeries() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int oddnos[]=new int[size];
		int sum=0;
		System.out.println("Enter the elements");
		for (int i = 0; i <size; i++) {
			oddnos[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(oddnos[i] % 2!=0) {
				sum = sum + oddnos[i];
			}
		}
			
			System.out.println("Sum: "+sum);
			sc.close();
		}
	
	//public static void case2() {
		
		
	//}
	
	
}
	

