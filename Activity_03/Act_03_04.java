import java.util.Scanner;
public class Act_03_04 {
    public static void main(String[] args) {
        float attendance,CA_marks;
        Scanner s = new Scanner(System.in);
    
        //getting inputs
        System.out.print("Enter your attendance : ");
        attendance = s.nextFloat();
        System.out.print("Enter your CA marks : ");
        CA_marks = s.nextFloat();

        //checking eligibility
        if(attendance >= 80 && CA_marks >= 40)
            System.out.println("Eligible !");
        else
            System.out.println("Not Eligible !");
    }
}
