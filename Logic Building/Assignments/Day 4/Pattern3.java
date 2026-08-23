public class Pattern3{
	public static void main(String [] args){

		int num = 5;
		int num1 = 1;

		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num1 + " ");
				num1++;
			}
			System.out.println();
		}
	}
}