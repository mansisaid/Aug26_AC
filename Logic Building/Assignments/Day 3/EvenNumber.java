/* Write a Java program that prints all even numbers between 1 and 50 using a while loop.
1. Create a method printEvenNumbers() that prints all even numbers from 1 to 50.
2. Use a while loop to iterate from 1 to 50 and print the even numbers. */

class EvenNumber{

	static void printEvenNumbers(){
			int num1 = 1;
	
		while(num1 <= 50){
			if(num1 % 2 == 0){
				System.out.print(num1 + " ");
			}
			num1++;
		}
	}

	public static void main(String args[]){
	
		EvenNumber.printEvenNumbers();
	}
}
