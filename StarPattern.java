class StarPattern{
	public static void main(String a[]){
	StarPattern pattern=new StarPattern();
	int rows=Integer.parseInt(a[0]);
	pattern.printStarPatternIncreasing(rows);
	pattern.printStarPatternDecreasing(rows);
	pattern.printStarPatternThree(rows);
    pattern.printStarPatternFour(rows);
	pattern.printStarPatternFive(rows);
	pattern.printStarPatternSix(rows);
	pattern.printStarPatternSeven(rows);
	pattern.printStarPatternEight(rows);
	pattern.printStarPatternNine(rows);
	pattern.printStarPatternTen(rows);
	}
	
	public void printStarPatternIncreasing(int rows){
		
		for (int r=1;r<=rows;r++){
			for(int c=1;c<=r;c++){
					System.out.print("*");
			}
			System.out.println();
		}
	System.out.println();
	}
	
	public void printStarPatternDecreasing(int rows){
		
		for (int r=1;r<=rows;r++){
			for(int c=1;c<=r;c++){
					System.out.print(" ");
			}
			for(int c=r;c<=rows;c++){
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println();
	}
	
	public void printStarPatternThree(int rows){
		
		for (int r=1;r<=rows;r++){
			for(int c=1;c<=r;c++){
				if(r==3 && c==2 || r==4 && c==2 || r==4 && c==3){
					System.out.print(" ");
					}else{
						System.out.print("*");
					}
			}
			System.out.println();
		}
		
	System.out.println();
	}
	
	public void printStarPatternFour(int rows){
		
		for (int r=1;r<=rows;r++){
			for(int c=1;c<=r;c++){
				System.out.print(" ");
			}
			for(int c=r;c<=rows;c++){
				if(r==2 && c==3 || r==2 && c==4 || r==3 && c==4){
					System.out.print(" ");
					}else{
						System.out.print("*");
					}
			}
			System.out.println();
		}
		
	System.out.println();
	}
	
	public void printStarPatternFive(int rows){
		
		for (int r=1;r<=rows;r++){
			for(int c=r;c<=rows;c++){
					System.out.print("*");
			}
			System.out.println();
		}
	System.out.println();
	}
	
	public void printStarPatternSix(int rows){
		
		for (int r=1;r<=rows;r++){
			for(int c=r;c<=rows;c++){
				if(r==2 && c==4 || r==2 && c==3 || r==3 && c==4){
					System.out.print(" ");
					}else{
						System.out.print("*");
					}
			}
			System.out.println();
		}
		
	System.out.println();
	}
	
	public void printStarPatternSeven(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=r;c<=rows;c++){
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++){
				System.out.print("*");
			}
		System.out.println();
		}
	System.out.println();
	}
	
	public void printStarPatternEight(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=r;c<=rows;c++){
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++){
				if(r==3 && c==2 || r==4 && c==2 || r==4 && c==3){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void printStarPatternNine(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
				if(r==c || r==1 && c==5 || r==2 && c==4 || r==4 && c==2 || r==5 && c==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void printStarPatternTen(int rows){
		for(int r=1;r<rows;r++){
			for(int c=(r-1);c<rows;c++){
				System.out.print(" ");
			}
			for(int c=1;c<r-1;c++){
				System.out.print("*");
			}
			for(int c=1;c<r;c++){
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
	}
				
	


	
	
	
	
	
	
	
	
	
	
	
}