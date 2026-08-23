//Write a Java program that asks the user for a number N and prints all the even numbers from 1 to N using a for loop.

import java.util.Scanner;
public class EvenNumbers{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		for(int i= 1; i <= num; i++){
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
		}
		
	}
}