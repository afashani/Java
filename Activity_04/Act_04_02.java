import java.util.Scanner;
public class Act_04_02 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array elements:");
        int a[] = new int[4];
        
        for(int i = 0; i < 4; i++){
            a[i] = s.nextInt();

        }

        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        
        System.out.println("Maximun value : "+ max);
        System.out.println("Minimum value : "+ min);

    }
}
