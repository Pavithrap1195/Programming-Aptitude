class Matrix{

public static void main(String a[]){
printMatrix();
printMatrixPlus();
printMatrixBelowThree();
printMatrixAboveThree();
}

public static void printMatrix(){
for(int r=1;r<=5;r++){
for(int c=1;c<=5;c++){
if(r==1 || c==1 || c==5 || r==5){
System.out.print(r+""+c+"\t");
}else{
	System.out.print("\t");
}
}
System.out.println();
}
System.out.println();
}

public static void printMatrixPlus(){
	for(int r=1;r<=5;r++){
	for(int c=1;c<=5;c++){
	if(r==3 || c==3){
	System.out.print(r+""+c+"\t");
	}else{
		System.out.print("\t");
	}
	}
	System.out.println();
	}
System.out.println();
}
public static void printMatrixBelowThree(){
for(int r=1;r<=3;r++){	
	for(int c=1;c<=3;c++){
      if(r==3 || c==3){
System.out.print(r+""+c+"\t");
	}else{
		System.out.print("\t");
	}
	}
	System.out.println();
}
System.out.println();
}
public static void printMatrixAboveThree(){
	for(int r=1;r<=5;r++){
		for(int c=1;c<=5;c++){
			if(r>=3 && c>=3){
				System.out.print(r+""+c+"\t");
			}else{
				System.out.print("\t");
			}
		}
		System.out.println();
	}
	System.out.println();
}

}