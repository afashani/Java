import java.util.Scanner;
public class Act_02_11 {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);

        //get input
        System.out.print("Enter your string here : ");
        str = s.nextLine();

        // a) display the length
        System.out.println("Length of the string : " + str.length());

        // b) index of the first occurrence of character 'a'
        System.out.println("Index of the first occurrence of character \'a\' : "+ str.indexOf('a'));

        // c) index of the last occurrence of character 'a'
        System.out.println("Index of the last occurrence of character \'a\' : " + str.lastIndexOf('a'));

    }
    
}
