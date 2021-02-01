import java.util.Scanner;
public class Act_02_06 {
    public static void main(String[] args) {
    //input and scanner
        char ch;
        Scanner s = new Scanner(System.in);

        System.out.print("Input the Character : ");
        ch = s.next().charAt(0);
        int ascii_ch = ch;
    //output
        System.out.println("The ASCII value of \'"+ ch + "\' : " + ascii_ch);
    }
}
