class StringApti{
	 public static void main(String a[]){
		 StringApti apti=new StringApti();
		 System.out.println("Count the 'e' character in 'Hello developers'");
		 apti.string1();
		 System.out.println("---------------------------------------------------------------------------------------------");
		 System.out.println("Count the number of words in 'Hii I am Pavithra'");
		 apti.string2();
		 System.out.println("---------------------------------------------------------------------------------------------");		 
		 System.out.println("Replace 'u' character by '&' in 'I am pursuing full stack course in xworkz institute'");
		 apti.string3();
		 System.out.println("---------------------------------------------------------------------------------------------");		 
		 System.out.println("Remove duplicate character in 'Happiness'");
		 apti.string4();
		 System.out.println("---------------------------------------------------------------------------------------------");		 
		 System.out.println("Replace 'Happiness' by 'Sadness' ");
		 apti.string5();
		 System.out.println("---------------------------------------------------------------------------------------------");		 
		 System.out.println("Split the string by given character-'Xworkz@Rajajinagar' at '@'");
		 apti.string6();
		 System.out.println("---------------------------------------------------------------------------------------------");		 
		 System.out.println("Search the word-'how' from String-'Hii how are you'");
		 apti.string7();
		 System.out.println("---------------------------------------------------------------------------------------------");		 
		 System.out.println("Convert a given word to lowercase-'Pavithra'");
		 apti.string8();
		 
		 
		 
		 
	 }	 
	public static void string1(){
		 String s="Hello developers";
		 char []ch=s.toCharArray();
		 char c= 'e';
		 int count = 0;
		 for(int i=0;i<ch.length;i++){
			 if(ch[i]==c){
				 count++;
			 }
		 }
		 System.out.println(count);
	 }
	 
	 void string2(){
		 String s="Hii I am Pavithra";
		 char []ch=s.toCharArray();
		 char c=' ';
		 int count=1;
		 for(int i=0;i<ch.length;i++){
			 if(ch[i]==c){
				 count++;
			 }
		 }
		 System.out.println(count);
	 }
	 
	 void string3(){
		 String s="I am pursuing full stack course in xworkz institute";
		 char []ch=s.toCharArray();
		 char c1='u';
		 char c2='&';
		 for(int i=0;i<ch.length;i++){
			 if(ch[i]==c1){
				 ch[i]=c2;
			 }
			 System.out.print(ch[i]);
		 }
		 System.out.println();
	 }
	 
	 void string4(){
		 String s="Happiness";
		 for(int i=0;i<s.length();i++){
		 char ch=s.charAt(i);
		 int ind=s.indexOf(ch, i+1);
		 if(ind==-1){
			 System.out.print(ch);
		 }
		 }
		 System.out.println();
	 }
	 
	 void string5(){
		 String s="Happiness";
		 System.out.print(s.replace("Happiness","Sadness"));
			System.out.println();
	 }
	 
	 
	 void string6(){
		 String s="Xworkz@Rajajinagar";
		 //char ch[]=s.toCharArray();
		 String[] str=s.split("@");
		 for(String string : str){
		 System.out.println(string);
		 }
	 }
	 
	 void string7(){
		 String s="Hii how are you";
		 //char []ch=s.toCharArray();
		 String search="how";
		 System.out.print(s.contains(search));
		System.out.println();
	 }
	 
	 
	 void string8(){
		 String s="Pavithra";
		 char ch[]=s.toCharArray();
		 System.out.println(s.toLowerCase());
	 }
		 
		 
}










