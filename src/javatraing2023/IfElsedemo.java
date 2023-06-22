package javatraing2023;

public class IfElsedemo {

	public static void main(String[] args) {
		
	
        // example = 1
		
	        int m = 10;
			int n = 20;
			if (n<m) {
				System.out.println("n is grater than m");
				
			}
			else {
				System.out.println("n is less than m");
				
			}
			
        // example = 2
			
			int o = 20;
			int p = 30;
			if (o!=p) {
				System.out.println("o and p are not equal");
				}
			else {
				System.out.println("o and p are equal");
			}
			
			System.out.println("******");
			
			int i = 40;
			int j = 50;
			int k = 60;
			
			if((i<j) && (i<k)) {
				System.out.println("k is grater");
			}
			else if((j<i) && (j<k)) {
				System.out.println("j is grater");
			}
			else {
				System.out.println("i is greater");
			}
				
			
			

	}
}