package com.xworkz.testapp;

import java.util.Arrays;

public class Sorting {
	
	
	
	
	public static  boolean sortArray(short numbers[]) {
		boolean sorted = false;
		short temp;
		for(int i=0;i<numbers.length;i++) {
			for(int j =0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					temp = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		
		return true;
		
	}
	
	

}
