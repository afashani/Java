import java.util.Scanner;
public class Act_05_08 {

    public static void cTOf(float C){
        float F;
        F = (C*9/5) + 32;
        System.out.printf("%.2f Celsius = %.2f Fahrenheit ",C,F);

    }
    public static void fTOc(float F){
        float C;
        C = (5*(F-32)/9);
        System.out.printf("%.2f Fahrenheit = %.2f Celsius ",F,C);

    }
    public static void main(String[] args) {
        char unit;
        float reading;
        Scanner ch = new Scanner(System.in);
        Scanner fl = new Scanner(System.in);

        System.out.print("Mention C or F : ");
        unit = ch.nextLine().charAt(0);
        System.out.print("Temperature : ");
        reading = fl.nextFloat();

        if(unit == 'C' || unit == 'c'){
            cTOf(reading);
        }else if(unit == 'F' || unit == 'f'){
            fTOc(reading);
        }
        else
            System.out.print("Invalid Unit !");

        
    }
}
