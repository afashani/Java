import java.util.Scanner;
public class Act_05_06 {
    public static void checkEligibility(Float att, Float CA){
        if(att >= 80 && CA >= 40)
            System.out.println("Eligible !");
        else
            System.out.println("Not Eligible !");
        }

    public static void main(String[] args) {
        float attendance,CA_marks;
        Scanner s = new Scanner(System.in);
    
        //getting inputs
        System.out.print("Enter your attendance : ");
        attendance = s.nextFloat();
        System.out.print("Enter your CA marks : ");
        CA_marks = s.nextFloat();

        checkEligibility(attendance, CA_marks);
    }
}
