package javatraing2023;

public class HollowInvertedFullPyramid {

	public static void main(String[] args) {
		
		for(int j=1; j<=6; j++) {
			for(int i=1; i<=j; i++) {
				System.out.print(" ");
			}
			
			for(int k=6; k>=j; k--) {
				if(k==6 || j==1 || k==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		

	}

}
