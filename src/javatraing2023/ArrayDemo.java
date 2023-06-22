package javatraing2023;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter total numbers of array:");
		int totalnums = s1.nextInt();
		int nums[] = new int [totalnums]; // input total number
		
		System.out.println("-----------------");
		for(int m=0; m<totalnums; m++) {
			System.out.println("Enter number:" +(m+1));
			int value = s1.nextInt();
			nums[m] = value;
		}
		System.out.println("-----------------"); // find maximum number
		int maxnumber = findMaxNumber(nums);
		System.out.println("Maximum number is :" +maxnumber);
		
		System.out.println("-----------------"); // find minimun number
		int mininumber = findMiniNumber(nums);
		System.out.println("Minimum number is :" +mininumber);
		
		System.out.println("------------------"); //find sum of numbers
		int sum = findSumNumber(nums);
		System.out.println("sum of numbers is :" +sum);
		
		System.out.println("-------------------"); // find avg number
		System.out.println("average of number is :" +sum/totalnums);
		
		System.out.println("--------------------"); // find second highest number
		int secondHighestNumber = findSecondHighestNumber(nums);
		System.out.println("Second highest number:" +secondHighestNumber);
		
		System.out.println("--------------------"); // find even number
		int even = findEvenNumber(nums);
		
		
	}
	
	

	private static int findEvenNumber(int[] nums) {
		int even = 0;
		for(int number:nums) {
			if((number%2)==0) {
				System.out.println("Even number is:" +number);
			}
			
		}return even;
		
	}

	private static int findSecondHighestNumber(int[] nums) {
		int highest = 0;
		int secondHighestNumber = highest;
		for(int number:nums) {
			if(number>highest) {
				secondHighestNumber = highest;
				highest = number;
			}
			else if (number>secondHighestNumber) {
				secondHighestNumber = highest;
			}
		}return secondHighestNumber ;
		
	}

	private static int findSumNumber(int[] nums) {
		int sum = 0;
		for(int number:nums) {
			sum = sum+number;
		}return sum;
				
	}
	
	

	private static int findMiniNumber(int[] nums) {
		int mininumber = nums[0];
		for(int number:nums) {
			if(mininumber>number) {
				mininumber = number;
				
			}
		}return mininumber;
		
	}
	

	private static int findMaxNumber(int[] nums) {
		int maxnumber = 0;
		for(int number:nums) {
			if(maxnumber<number) {
				maxnumber = number;
			}
		}return maxnumber;
				
	}

	
			

}