package javatraing2023;

public class BreakConditionDemo {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("*******");
		
		for(int y=1; y<=10; y++) {
			if(y==5) {
				continue;
			}
			System.out.println(y);
		}
		
	}

}
