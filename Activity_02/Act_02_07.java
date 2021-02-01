import java.util.Scanner;
public class Act_02_07 {
    public static void main(String[] args) {
        int num,p1,p2;
        Scanner s = new Scanner(System.in);

        //input two digit number
        System.out.print("Enter a two digit number : ");
        num = s.nextInt();

        //calculations
        if (num>=10 && num<=99) {
            p1 = num/10;
            p2 = num%10;
            //output
            System.out.println("Sum of two digits : "+ (p1+p2));
            System.out.print("Reversed number : "+ p2 + "" + p1);
        } else{
            System.out.println("Invalid Input !");
        }        
        
    }
}
