import java.util.Scanner;
public class Act_05_02 {

    public static void checkSign(int num){
        if (num > 0){
            System.out.println("Positive");
         } else if(num < 0){
            System.out.println("Negative");
         } else {
            System.out.println("Zero");
         }
        }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number : ");
        n = s.nextInt();
        checkSign(n);
        }
        
    }
    

