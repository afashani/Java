import java.util.Scanner;
public class Act_05_07 {

    public static void quotient(int num1, int num2){

        System.out.println("Quotient : " + (num1/num2));

    }
    public static void remainder(int num1, int num2){

        System.out.println("Remainder : " + (num1%num2));

    }
    public static void main(String[] args) {
        
        int first_int,second_int;
        Scanner s = new Scanner(System.in);

        System.out.print("First number : ");
        first_int = s.nextInt();
        System.out.print("Second number : ");
        second_int = s.nextInt();

        quotient(first_int, second_int);
        remainder(first_int, second_int);
    }

}
