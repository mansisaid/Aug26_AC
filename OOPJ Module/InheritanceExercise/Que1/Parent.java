public class Parent 
{
	void parentMethod()
	{
		System.out.println("This is Parent class");
	}

	public static void main(String[] args) 
	{
		Parent p = new Parent();
		Child c = new Child();
	
		p.parentMethod();
		c.childMethod();
		c.parentMethod();
	}
}
