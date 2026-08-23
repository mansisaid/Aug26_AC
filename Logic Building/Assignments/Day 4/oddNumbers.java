//Write a Java program that asks the user for a number N and calculates the sum of all odd numbers between 1 and N using a for loop.

import java.util.Scanner;
public class OddNumbers{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		int ans = 0;

		for(int i= 1; i <= num; i++){
			if(i % 2 == 1){
				ans = ans + i;
			}
		}
		System.out.print("The sum of odd numbers from 1 to " + num +" s:" +ans);
	}

}