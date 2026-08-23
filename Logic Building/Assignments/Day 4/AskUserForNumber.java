//Write a Java program that asks the user for a number N and then prints the numbers from 1 to N using for loop.

import java.util.Scanner;
public class AskUserForNumber{

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number N: ");
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			System.out.print(i + " ");
		}
	}
}