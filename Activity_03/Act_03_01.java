import java.util.Scanner;
public class Act_03_01{
   public static void main(String args[]){
      int num;
      System.out.print("Enter a number : ");
      Scanner s = new Scanner(System.in);
      num = s.nextInt();

      if (num > 0){
         System.out.println("Positive");
      } else if(num < 0){
         System.out.println("Negative");
      } else {
         System.out.println("Zero");
      }
   }
}