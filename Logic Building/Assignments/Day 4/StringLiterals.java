//Write a Java program that declares three string literals with the same content and prints whether all three strings refer to the same object using the == operator.

public class StringLiterals {
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        System.out.println("All strings point to the same object: " + (str1 == str2 && str2 == str3));
    }
}