package javatraing2023;

public class Nested_IfDemo {

	public static void main(String[] args) {
		int rating = 10;
		
		 if (rating >5 ) {
			 System.out.println("Bad rating");
		 }else {
			 if(rating < 8) {
				 System.out.println("Average rating");
			 }else {
				 System.out.println("Good rating");
			 }
		 }
	}

}
