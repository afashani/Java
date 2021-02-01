import java.util.Scanner;
public class Act_02_04 {
    public static void main(String[] args) { 
//variables & scanner
        int first_int,second_int;

        Scanner s = new Scanner(System.in);

//getting inputs
        System.out.print("First number : ");
        first_int = s.nextInt();
        System.out.print("Second number : ");
        second_int = s.nextInt();

//calculations and outputs
    //getting quotient
        System.out.println("Quotient : " + (first_int/second_int));

    //getting remainder
        System.out.println("Remainder : " + (first_int%second_int));
    }
}
