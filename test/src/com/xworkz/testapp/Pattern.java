package com.xworkz.testapp;

public class Pattern {
	
	public static boolean diamond(int rows) {
		
		
		for(int r =1;r<=rows;r++) {
			for(int c=1;c<=rows;c++) {
				if((r+c)==(rows-1) || (r+c) == (rows)) {
					System.out.print(" * ");
				}else {
					System.out.print(" ");
				}
			}
		}
		
		
		return true;
	}

}
