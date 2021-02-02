import java.util.Scanner;
public class Act_04_01 {
    public static void main(String[] args) {
        int sum = 0,avg = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array elements:");
        int a[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            a[i] = s.nextInt();
            sum = sum + a[i];

        }
        avg = sum/5;
    
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+avg);
    }
    
}
