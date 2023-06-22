package javatraing2023;

public class FullyPyramid {

	public static void main(String[] args) {
		for(int j=1; j<=6; j++) {
			for(int i = 6; i>=j; i--) {
				System.out.print(" ");
			}
			
			for(int k =1; k<=j; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
