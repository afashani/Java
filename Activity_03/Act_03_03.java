import java.util.Scanner;
public class Act_03_03 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
    
        System.out.print("Enter a number : ");
        num = s.nextInt();
    
        if (num > 60){
            System.out.println("I like Ice Cream");
         } else if(num > 30){
            System.out.println("I like Chocolate");
         } else if(num > 20){
            System.out.println("I like Apple");
         } else {
            System.out.println("I do not like anything");
         }
        
    }

}
