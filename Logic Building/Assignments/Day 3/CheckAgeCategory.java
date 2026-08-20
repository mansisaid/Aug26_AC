/* Write a Java program that includes a method to check the age category.
1. Create a method checkAgeCategory() that takes an integer (age) as a parameter and prints
whether the user is a minor, adult, or senior citizen.
2. In the main method, use the Scanner class to prompt the user to enter their age.
3. Pass the user's age to the checkAgeCategory() method. */

import java.util.Scanner;

class CheckAgeCategory{

	static void checkAgeCategory(int age){

		String category = (age < 18) ? "You are Minor" : (age >= 18 && age < 60) ? "You are Adult" : "You are senior citizen";

		System.out.println(category);
	} 


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age:");
		int age = sc.nextInt();


		checkAgeCategory(age);     
	}
}
