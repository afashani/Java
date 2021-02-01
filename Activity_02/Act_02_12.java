import java.util.Scanner;
public class Act_02_12 {
    public static void main(String[] args) {
        String str1, str2;
        Scanner s = new Scanner(System.in);

        //get inputs
        System.out.print("Enter first string here : ");
        str1 = s.nextLine();

        System.out.print("Enter second string here : ");
        str2 = s.nextLine();

        // a)
        System.out.println("The two strings are equal (Considering the case) : " + str1.equals(str2));
        // b)
        System.out.println("The two strings are equal (Without considering the case) : " + str1.equalsIgnoreCase(str2));
        // c) 
        System.out.println("First string starts with character 'a' : " + str1.trim().startsWith("a"));
        // d)
        System.out.println("First string starts with character 'a' : " + str2.trim().endsWith("a"));
        // e)
        System.out.print("First string contains \"ou\" : " + str1.contains("ou"));
        // f)
        System.out.print("Second string contains \"au\" : " + str2.contains("au"));

    }
}
