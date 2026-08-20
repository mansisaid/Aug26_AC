/* Write a Java program that prints the multiplication table for a given number (e.g., number 5) using a for
loop. The program should:
1. Create a method printMultiplicationTable() that takes a number as a parameter and prints its
multiplication table from 1 to 10.
2. Use a for loop to iterate through numbers 1 to 10 and print the multiplication results. */

import java.util.Scanner;
class Multiplicationtable{

	static void printMultiplicationTable(int number){
		for(int i = 1; i <= 10;i++){
			System.out.println(number + "x" + i + "=" + (number * i));
		}

	}
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int number = sc.nextInt();

		printMultiplicationTable(number);

	}	


}