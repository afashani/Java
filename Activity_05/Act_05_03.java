import java.util.Scanner;
public class Act_05_03 {

    public static void checkOddEven(int num){
        if(num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number : ");
        n = s.nextInt();
        checkOddEven(n);
        }
        
    }
    

