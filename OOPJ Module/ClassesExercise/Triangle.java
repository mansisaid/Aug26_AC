public class Triangle 
{
	int side1,side2,side3;
	
	Triangle(int a, int b, int c)
	{
		side1 = a;
		side2 = b;
		side3 = c;
	}
	
	public static void main(String[] args) 
	{
		Triangle t = new Triangle(3,4,5);
		
		int perimeter = t.side1 + t.side2 + t.side3;
		
		double area = (t.side1 * t.side2) / 2.0;
		
		System.out.println(perimeter);
		System.out.println(area);
	}

}
