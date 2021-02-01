import java.util.Scanner;
public class Act_02_05 {
    public static void main(String[] args) {

    //variables & scanner
        String full_name,index_number;
        int age;
        float current_GPA;

        Scanner s = new Scanner(System.in);

    //getting inputs
        System.out.print("Full name : ");
        full_name = s.nextLine();

        System.out.print("Index number : ");
        index_number = s.nextLine();

        System.out.print("Age : ");
        age = s.nextInt();

        System.out.print("Current GPA : ");
        current_GPA = s.nextFloat();
    //output       
        System.out.println("\n***Your details***");
        System.out.println(full_name);
        System.out.println(index_number);
        System.out.println(age);
        System.out.println(current_GPA);
       
    }    
}
