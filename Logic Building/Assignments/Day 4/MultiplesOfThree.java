//Write a Java program that asks the user for a number N and prints all the multiples of 3 between 1 and N using a for loop.

import java.util.Scanner;
public class MultiplesOfThree{

	static void divByThree(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		for(int i= 1; i <= num; i++){
			if(i %3 == 0)
				System.out.println(i);
		}
	}

	public static void main(String[] args){

		MultiplesOfThree.divByThree();
	}
}