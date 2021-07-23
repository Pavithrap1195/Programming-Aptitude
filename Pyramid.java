import java.util.Scanner;

class Pyramid{
	
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		int rows =sc.nextInt();
		Pyramid pyramid =new Pyramid();
		pyramid.pyramidOne(rows);
		pyramid.pyramidTwo(rows);
		pyramid.pyramidThree(rows);
		pyramid.pyramidFour(rows);
		pyramid.pyramidFive(rows);
		pyramid.pyramidSix(rows);
		pyramid.pyramidSeven(rows);
		pyramid.pyramidEight(rows);
		pyramid.pyramidNine(rows);
		pyramid.pyramidTen(rows);
	}
	
	public void pyramidOne(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
			if(c<=r  && (r+c)<=(rows+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public void pyramidTwo(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
				if(r<=c && (r+c)<=(rows+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void pyramidThree(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
			if(c<=r || c==1  || r+c>=(rows+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void pyramidFour(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
			if(c<=r || c==1 || r==1 || r+c<=(rows+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public void pyramidFive(int rows){
		int num=1;
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
				if(c<=r || r+c>=rows+1){
					System.out.print(num +"\t");
					num++;
				}else{
					System.out.print("\t");
					}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void pyramidSix(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
				if(r<=c && (r+c)>=(rows+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void pyramidSeven(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
				if(r>=c && (r+c>=rows+1)){
					System.out.print("*");
					}else{
						System.out.print(" ");
			}
		}
		System.out.println();
	}
	
		System.out.println();
	}
	
				
	
	public void pyramidEight(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
			if(c>=r || c==1 || (r+c)<=(rows+1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public void pyramidNine(int rows){
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
				if(r<=c || (r+c)>=(rows+1) || c==rows){
						System.out.print("*");
				}else{
					System.out.print(" ");
					}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void pyramidTen(int rows){
		int num=1;
		for(int r=1;r<=rows;r++){
			for(int c=1;c<=rows;c++){
				if(c<=r || (r+c)<=(rows+1)){
					System.out.print(num+"\t");
					num++;
				}else{
					System.out.print("\t");
					num++;
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
}

