public class AlphabetIndex
{
    public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog.";

        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            System.out.print(ch + " ");

            if ((ch - 'a' + 1) % 10 == 0)
            {
                System.out.println();
            }
        }

        System.out.println();

        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            System.out.print(str.indexOf(ch) + " ");

            if ((ch - 'a' + 1) % 10 == 0)
            {
                System.out.println();
            }
        }
    }
}