class NumberPattern{
	public static void main(String a[]){
		NumberPattern number=new NumberPattern();
		int num=Integer.parseInt(a[0]);
		number.printNumberPatternOne(num);
	    number.printNumberPatternTwo(num);
	    //number.printNumberPatternThree(num);//
	}
	
	public void printNumberPatternOne(int num){
		for(int r=1;r<=num;r++){
			for(int c=1;c<=r;c++){
				System.out.print(r);
		}
		System.out.println();
	}
	System.out.println();
}

    public void printNumberPatternTwo(int num){
		for(int r=1;r<=num;r++){
			int n=1;
			for(int c=r;c<=num;c++){
				System.out.print(n++ +"");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//*public void printNumberPatternThree(int num){//
		//for(int r=1;r<=num;r++){//
			//for(int c=1;c<=num;c++){//
				//if(r==c){//
					//System.out.print(r);//
				//}else{//
					//System.out.print("");//
				//}//
			//}//
			//System.out.println();//
		//}//
	//}//*















}