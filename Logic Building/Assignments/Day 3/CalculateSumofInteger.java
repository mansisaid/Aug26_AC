/* Write a Java program that calculates the sum of all integers from 1 to N (where N is a positive integer)
using a for loop. The program should:
1. Create a method calculateSum() that takes a number N and calculates the sum of all integers from
1 to N.
2. Use a for loop to iterate through all integers from 1 to N and add them up. */

import java.util.Scanner;
class CalculateSumofInteger{

	static void calculateSum(int N){
		int sum = 0;

		for(int i=1; i <= N; i++){
			sum = sum + i;
		}
		System.out.println("The sum of 1 to " + N + " is: " + sum);
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int N = sc.nextInt();
		calculateSum(N);
	}

}