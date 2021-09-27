package com.xworkz.testapp;

public class Searching {
	
	public static boolean search(short []num,int number) {
		int temp =0;
		for(int i =0;i<num.length;i++) {
			if(num[i]==number) {
				System.out.println("Number found at "+i+"th index position");
				temp = temp+1;
			}
		}
		if(temp ==0) {
			System.out.println("Number not found in the list");
		}
		
		
		
		return true;
		
	}

}
