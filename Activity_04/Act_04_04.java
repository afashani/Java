import java.util.Scanner;
public class Act_04_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner f = new Scanner(System.in);
        
        String fruits[] = new String[4];
        
        float price[] = new float[4];

        System.out.println("Fruits :");
        for(int i = 0; i < 4; i++){
            fruits[i] = s.nextLine();
        }

        System.out.println("Price :");
        for(int i = 0; i < 4; i++){
            price[i] = f.nextFloat();
        }
        System.out.println("***PRICE LIST***");
        for(int i = 0; i < 4; i++){
            System.out.println(fruits[i] + " : " + price[i]);
            
        }
    }
    
}
