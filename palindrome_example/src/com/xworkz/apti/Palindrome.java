package com.xworkz.apti;

public class Palindrome {
	
	public static void main(String[] args) {
		
		boolean result=checkPalindrome(545,0,545);
		if(result==true) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}
		
		static boolean checkPalindrome(int num,int sum,int n ) {
			int r;
			boolean answer=false;
			System.out.println(num+" \t"+sum+"\t"+n);
			
			if(num>0) {
				r=num%10;
				sum=(sum*10)+r;
				num=num/10;
				answer=checkPalindrome(num,sum,n);
			
			}else if(n==sum){
				return true;
			}
			
			return answer;
		}
	}

	




