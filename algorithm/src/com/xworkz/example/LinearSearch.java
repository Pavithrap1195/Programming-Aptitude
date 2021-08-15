package com.xworkz.example;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int numbers[]= {2,4,1,9};
		int num=4;
		linear(numbers,num);
		
	}
	
	static void linear(int numbers[],int num) {
		boolean found =false;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==num) {
				found=true;
				System.out.println("Number Found at index of "+i);
				break;
			}
		}
			if(found!=true) {
				System.out.println("Number not found in the array");
			}
			
		}
	}


