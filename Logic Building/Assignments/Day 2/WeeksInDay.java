/* Write a Java program that takes an integer between 1 and 7 and prints the corresponding day of the week
using a switch-case statement. If the input is outside the range of 1 to 7, the program should display
"Invalid day number". */

public class WeeksInDay{

	public static void main(String args[]){
		int choice = 5;

		switch(choice){
		case 1 : 
			System.out.println("Monday");
			break;
		case 2 : 
			System.out.println("Tuesday");
			break;
		case 3 : 
			System.out.println("Wednesday");
			break;
		case 4 : 
			System.out.println("Thursday");
			break;
		case 5 : 
			System.out.println("Friday");
			break;
		case 6 : 
			System.out.println("Saturday");
			break;
		case 7 : 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day number");
		
		}	
	}
}