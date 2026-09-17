//import console.ConsoleInput;

public class Member 
{
	private String Name;
	private int Age;
	private String PhoneNo;
	private String Address;
	private String Salary;
	
	//getter
	public String getName() 
	{
		return Name;
	}

	public int getAge() 
	{
		return Age;
	}

	public String getPhoneNo() 
	{
		return PhoneNo;
	}

	public String getAddress() 
	{
		return Address;
	}

	public String getSalary() 
	{
		return Salary;
	}

	
	//settter
	public void setName(String name) 
	{
		this.Name = name;
	}
	
	public void setAge(int age) 
	{
		this.Age = age;
	}
	
	public void setPhoneNo(String phoneNo) 
	{
		this.PhoneNo = phoneNo;
	}
	
	public void setAddress(String address) 
	{
		this.Address = address;
	}

	public void setSalary(float salary) 
	{
		this.Salary = Salary;
	}
	
	void printSalary()
	{
		System.out.println("Salary: " + Salary);
	}
	
	
	public static void main(String args[])
	{
		PrimeMembers p = new PrimeMembers();
		
		System.out.println("Enter Name:");
		p.setName(ConsoleInput.getString());
		
		System.out.println("Enter Age:");
		p.setAge(ConsoleInput.getInt());
		
		System.out.println("Enter Phone Number:");
		p.setPhoneNo(ConsoleInput.getString());
		
		System.out.println("Enter Address:");
		p.setAddress(ConsoleInput.getString());
		
		System.out.println("Enter Salary:");
		p.setSalary(ConsoleInput.getFloat());
		
		System.out.println("Enter Year:");
		p.setYear(ConsoleInput.getInt());
		
		System.out.println("Enter Fees:");
		p.setFees(ConsoleInput.getFloat());
		
		System.out.println("Is Active(true/false):");
		p.setActive(Boolean.parseBoolean(ConsoleInput.getString()));
		
		System.out.println("\nMember Details: ");
		p.display();
		p.printSalary();
		
	}

}
