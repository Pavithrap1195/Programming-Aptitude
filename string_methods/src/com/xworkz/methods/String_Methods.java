package com.xworkz.methods;

public class String_Methods {
	
	
	public static void main(String a[]) {
		String name="  Pavithra  ";
		String place="Bangalore";
		
		System.out.println("length method trial");
		int i=name.length();     //returns int value
		System.out.println(i);
		if(i==0) {
			System.out.println("Name is empty");
		}else {
			System.out.println("Valid name");
		}
		
		System.out.println("isEmpty method trial");
		System.out.println(name.isEmpty());    //returns boolean true or false value
		if(place.isEmpty()==false) {
			System.out.println("Name is not empty");
		}else {
			System.out.println("Name is cannot be empty");
		}
		
		System.out.println("trim method trial");
		System.out.println(name);             //returns string value
		System.out.println(name.trim());
		if(name.trim().length()==0) {
			System.out.println("Name is empty");
			
		}
		System.out.println("Checking equals method");
		String s1="pavi";
		String s2="Pavi";
		System.out.println(s1.equals(s2));  //return boolean value 
		System.out.println("Checking equals ignore case method");
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("Checking compare to method");
		String d1="AC";
		String d2="abc";
		System.out.println(d1.compareTo(d2));   //return int value
		System.out.println("Checking compare to ignore case method");
		System.out.println(d1.compareToIgnoreCase(d2));
		
		System.out.println("Checking string searching methods");
		String s="Pavithra";
		System.out.println(s.indexOf("t"));
		System.out.println(s.lastIndexOf("r"));
		System.out.println(s.charAt(5));
		System.out.println(s.contains("h"));
		System.out.println(s.startsWith("a"));
		System.out.println(s.endsWith("a"));
		System.out.println("Case conversion methods");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println("Type conversion methods");
		int b=20 , c=10;
		System.out.println(b+c);
		String p1=String.valueOf(b);
		String p2=String.valueOf(c);
		System.out.println(p1+p2);
		char[] d=s.toCharArray();
		System.out.println(d);
		
		System.out.println("Replace method");
		String quote="Do or die";
		System.out.println(quote.replace("or", "and"));
		System.out.println(quote.replaceFirst("o", "ne"));
		System.out.println(quote.replaceAll("or(.)", "and"));
		System.out.println(quote.replaceAll("or(.*)","and"));
		
		
		
	}

}
