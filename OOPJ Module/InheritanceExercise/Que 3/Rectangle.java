public class Rectangle
{
    protected int length;
    protected int breadth;

    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea()
    {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void printPerimeter()
    {
        System.out.println("Perimeter of Rectangle = " + (2 * (length + breadth)));
    }

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(10, 5);

        r.printArea();
        r.printPerimeter();

        Square s = new Square(5);

        s.printArea();
        s.printPerimeter();
    }
}