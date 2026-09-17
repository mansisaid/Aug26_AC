public class PrimeMembers extends Member
{
	private int year;
	private float fees;
	private boolean isActive;
	

	//getter
	public int getYear() 
	{
		return year;
	}

	public float getFees() 
	{
		return fees;
	}
	
	public boolean isActive() 
	{
		return isActive;
	}
	

	//setter
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public void setFees(float fees) 
	{
		this.fees = fees;
	}

	public void setActive(boolean isActive) 
	{
		this.isActive = isActive;
	}
	
	//display details
	void display()
	{
		System.out.println("Name = " + getName());
		System.out.println("Age = " + getAge());
		System.out.println("Phone Number = " + getPhoneNo());
		System.out.println("Address = " + getAddress());
		System.out.println("Salary = " + getSalary());
		System.out.println("year = " + getYear());
		System.out.println("fees = " + getFees());
		System.out.println("Active = " + isActive());
	}
}
