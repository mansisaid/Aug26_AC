/* Write a Java program that includes a method to calculate the sum of two numbers.
1. Create a method sumOfTwoNumbers() that takes two integers as parameters, calculates their sum,
and returns the result.
2. In the main method, use the Scanner class to prompt the user to enter two integers.
3. Pass the user inputs to the sumOfTwoNumbers() method and print the sum. */

import java.util.Scanner;

class CalculateSum{

	int sumOfTwoNumbers(int a,int b){
		int result = a + b;
		return result;
	}		
			
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number :");
		int num1 = sc.nextInt();

		System.out.println("Enter 2nd Number :");
		int num2 = sc.nextInt();
		
		CalculateSum obj = new CalculateSum();
		int result = obj.sumOfTwoNumbers(num1,num2);
		System.out.println("Sum of " + num1 + " and " + num2 + " is :" + result);

	}

}