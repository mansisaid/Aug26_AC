/* Write a Java program that repeatedly asks the user to enter a positive number.
1. Create a method askForPositiveNumber() that uses a do-while loop to ask the user for a number
until they enter a positive number.
2. Use the Scanner class to take the user’s input.
3. Once a positive number is entered, the program should display the number */

import java.util.Scanner;
class AskForPositiveNum{

	static void askForPositiveNumber(){
	
		Scanner sc = new Scanner(System.in);
		int num;

		do{
			System.out.println("Enter Positive Number: ");
			num = sc.nextInt();
		}while(num <= 0);
		System.out.println("You Entered a Positive Number: " + num);
		
	}

	public static void main(String args[]){

		askForPositiveNumber();
	}
}