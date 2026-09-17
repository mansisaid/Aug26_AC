public class Square1 extends Rectangle1
{
    void square()
    {
        System.out.println("Square is a rectangle");
    }

    public static void main(String[] args)
    {
        Square1 s = new Square1();

        s.shape();
        s.rectangle();
    }
}