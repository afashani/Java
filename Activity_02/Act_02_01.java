import java.util.Scanner;
public class Act_02_01 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner s = new Scanner(System.in);
        System.out.print("First Number :");
        num1 = s.nextInt();
        System.out.print("Second Number :");
        num2 = s.nextInt();

        //addition
        System.out.println("Sum = "+ (num1 + num2));

        //subtraction
        System.out.println("Difference = "+ (num1 - num2));

        //multiplication
        System.out.println("Product = "+ (num1 * num2));

        //division
        System.out.println("Quotient = "+ (num1 / num2));

        //remainder
        System.out.println("Remainder = "+ (num1 % num2));

        //largest and smallest
        int largest_number,smallest_number;
        largest_number = (num1 > num2)? num1 : num2 ;
        System.out.println("The largest number is "+ largest_number);
        smallest_number = (num1 < num2)? num1 : num2 ;
        System.out.println("The smallest number is "+ smallest_number);

    }
    
}
