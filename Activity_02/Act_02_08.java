import java.util.Scanner;
public class Act_02_08 {
    public static void main(String[] args) {
        float C, F;
        Scanner s = new Scanner(System.in);

        //getting user inputs
        System.out.print("Input temperature in celsius : ");
        C = s.nextFloat();

        //calculations
        F = (C*9/5) + 32;

        //Display output

        System.out.printf("In Fahrenheit : %.2f",F);        
    }    
}
