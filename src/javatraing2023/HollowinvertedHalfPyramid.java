package javatraing2023;

public class HollowinvertedHalfPyramid {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				if(j==1 || j==5 || i==1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			
	
		}
			System.out.println();

	}

   }
}
