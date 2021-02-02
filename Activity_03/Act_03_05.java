import java.util.Scanner;
public class Act_03_05 {
    public static void main(String[] args) {
        char ch;
        Scanner s = new Scanner(System.in);

        //getting input
        System.out.print("Input the character : ");
        ch = s.next().charAt(0);

        switch(ch) {

	        case 'a' :case 'A' :
	        case 'e' :case 'E' :
    	    case 'i' :case 'I' :
	        case 'o' :case 'O' :
	        case 'u' :case 'U' :	        
                    System.out.println(ch+" is  a Vowel");
                break;
                default:
                    System.out.println(ch+" is a Consonant");
	
        }
        
    }
    
}
