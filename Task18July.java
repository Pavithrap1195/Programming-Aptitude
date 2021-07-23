import java.util.Scanner;

class Task18July{
	
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		int rows =sc.nextInt();
		Task18July task =new Task18July();
		task.patternOne(rows);
		System.out.println("-------------------------------");
		task.patternTwo(rows);
		System.out.println("-------------------------------");
		task.patternThree(rows);
		System.out.println("-------------------------------");
		task.patternFour(rows);
		System.out.println("-------------------------------");
		task.patternFive(rows);
		System.out.println("-------------------------------");
		task.patternSix(rows);
		System.out.println("-------------------------------");
		task.patterSeven(rows);
		System.out.println("-------------------------------");
		task.patterEight(rows);
		System.out.println("-------------------------------");
		task.patterNine(rows);
		System.out.println("-------------------------------");
		task.patterTen(rows);
	}
	
	public void patternOne(int rows){
		int r=1;
		
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(c<=r  && (r+c)<=(rows+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
					
				}
				c++;
			}
			r++;
			System.out.println();
					
		}	
	}
	
	public void patternTwo(int rows){
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(r<=c && r+c<=rows+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public void patternThree(int rows){
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(c<=r || c==1 || r+c>=rows+1){
					System.out.print("*");
					}else{
						System.out.print(" ");
					}
					c++;
			}
			System.out.println();
			r++;
		}
	}
			
	public void patternFour(int rows){
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(c<=r || r==c || r+c<=rows+1){
					System.out.print("*");
					}else{
						System.out.print(" ");
					}
					c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public void patternFive(int rows){
		int num=1;
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(c<=r || r+c>=rows+1){
					System.out.print(num+"\t");
					num++;
				}else{
					System.out.print("\t");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void patternSix(int rows){
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(r<=c && r+c>=rows+1 ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void patterSeven(int rows){
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(r>=c && r+c>=rows+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void patterEight(int rows){
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(c>=r || r+c<=rows+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void patterNine(int rows){
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(r<=c || r+c>=rows+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void patterTen(int rows){
		int number=1;
		int r=1;
		while(r<=rows){
			int c=1;
			while(c<=rows){
				if(c<=r || r+c<=rows+1){
					System.out.print(number+"\t");
					number++;
				}else{
					System.out.print("\t");
					number++;
				}
				c++;
			}
			r++;
			System.out.println();
		}
	}

	
		
	
		
		
		
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}