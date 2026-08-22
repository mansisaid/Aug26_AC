/* Write a Java program that calculates the average marks of a student and determines the grade based on the
following criteria:
Grade A: Average marks ≥ 90
Grade B: Average marks between 70 and 89
Grade C: Average marks between 50 and 69
Grade D: Average marks between 30 and 49
Fail: Average marks < 30   */

public class CalculateAvgMark{

		
	public static void main(String []args){

		int math = 80;
		int science = 85;
		int history = 90;

		int avg = (math + science + history)/3;

		if(avg >= 90){
			System.out.println("Grade A");
		}
		else if(avg >= 70 && avg <= 89){
			System.out.println("Grade B");
		}
		else if(avg >= 50 && avg <= 69){
			System.out.println("Grade C");
		}
		else if(avg >= 30 && avg <= 49){
			System.out.println("Grade D");
		}
		else
			System.out.println("Fail");
	}			
}
