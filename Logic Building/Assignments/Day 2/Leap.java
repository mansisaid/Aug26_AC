/* Write a Java program that checks whether the year is a leap year or not. A year is a leap year if:
It is divisible by 4, but not divisible by 100, or
It is divisible by 400.  */

public class Leap{

	public static void main(String args[]){
			int year = 2012;

		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("Leap Year");
		}
		else

			System.out.println("Not Leap Year");

	}
}