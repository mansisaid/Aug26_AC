//Write a Java program that finds and prints the largest of three predefined numbers using if-else statements. 
class LargeNumber{

	public static void main(String args[]){

		int num1 = 50;
		int num2 = 20;
		int num3 = 10;

		if(num1 >= num2 && num1 >= num3){
			System.out.println("Number " + num1 + " is largest");

		}else if (num2 >= num1 && num2 >= num3){
			System.out.println("Number " + num2 + " is largest");

		}else{
			System.out.println("Number " + num3 + " is largest");
		
		}
	
	}

}
