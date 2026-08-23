// Write a Java program that asks the user for a number N and calculates the factorial of N using a for loop.

import java.util.Scanner;
public class Factorial{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int ans = 1;

		for(int i= 1; i <= num; i++){
			ans = ans * i;
		}
	System.out.println(ans);
	}
}