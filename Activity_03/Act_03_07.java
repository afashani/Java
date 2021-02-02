import java.util.Scanner;
public class Act_03_07 {
    public static void main(String[] args) {
        float GPA;
        Scanner s = new Scanner(System.in);
    
        //getting inputs
        System.out.print("Enter your GPA : ");
        GPA = s.nextFloat();

        //checking
        if(GPA >= 3.7 && GPA <= 4.0)
            System.out.println("First Class");
        else if(GPA > 3.29 && GPA <3.7)
            System.out.println("Second Upper");
        else if(GPA >= 3.0 && GPA < 3.3)
            System.out.println("Second Lower");
        else if(GPA < 3.0 && GPA > 0)
            System.out.println("General");
        else
            System.out.println("Invalid GPA!");
    }
}
