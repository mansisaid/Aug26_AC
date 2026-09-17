public class Employee2 
{
	float salary;
	int hours;
	
	void getInfo(float s,int h)
	{
		salary = s;
		hours = h;
	}
	
	void addSal()
	{
		if(salary < 500)
		{
			salary = salary + 10;
		}
	}
	
	void addWork()
	{
		if(hours > 6)
		{
			salary = salary + 5;
		}
	}
	
	public static void main(String[] args) 
	{
		Employee2 e = new Employee2();
		
		System.out.println("Enter Salary: ");
		float s = ConsoleInput.getFloat();
		
		System.out.println("Enter Working hours per day: ");
		int h = ConsoleInput.getInt();
		
		e.getInfo(s, h);
		e.addSal();
		e.addWork();
		
		System.out.println("Final Salary = $" + e.salary);
	}
	
}
