import java.util.Scanner;
public class Act_03_06 {
    public static void main(String[] args) {
        char grade;
        Scanner s = new Scanner(System.in);

        //getting input
        System.out.print("Input the Grade : ");
        grade = s.next().charAt(0);

        switch(grade) {

            case 'a' :case 'A' :
                System.out.println("Excellent");
                break;
            case 'b' :case 'B' :
                System.out.println("Well Done");
                break;
            case 'c' :case 'C' :
                System.out.println("Good");
                break;
            case 'd' :case 'D' :
                System.out.println("You Pass");
                break;
	        case 'f' :case 'F' :	        
                System.out.println("Better Try Again");
                break;
                default:
                    System.out.println("Invalid Grade !");
	
        }
    }
}
