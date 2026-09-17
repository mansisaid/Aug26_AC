public class Employee1 
{
	String name;
	int year;
	int salary;
	String address;

	Employee1(String n, int y, String a)
	{
		name = n;
		year = y;
		address = a;
	}
	
	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1("Robert" , 1994, "64C-WallsStreat");
		Employee1 e2 = new Employee1("Sam" , 2000, "68D-WallsStreat");
		Employee1 e3 = new Employee1("John" , 1999, "26Bs-WallsStreat");
		
		System.out.println("Name\t Year of joining \t Address");
		
		System.out.println(e1.name + "\t\t" + e1.year + "\t\t" + e1.address);
		System.out.println(e2.name + "\t\t" + e2.year + "\t\t" + e2.address);
		System.out.println(e3.name + "\t\t" + e3.year + "\t\t" + e3.address);

	}
}
