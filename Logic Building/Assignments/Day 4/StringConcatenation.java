public class StringConcatenation {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "world";
        String str3 = str1 + str2;

        System.out.println("Concatenated string: " + str3);
        System.out.println("Is str3 a new object? " + (str3 != "helloworld"));
    }
}