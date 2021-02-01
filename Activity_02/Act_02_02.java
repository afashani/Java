import java.util.Scanner;
public class Act_02_02 {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float radius;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the radius : ");
        radius = s.nextFloat();

        //diameter
        System.out.printf("Diameter : %.2f\n", (2*radius));

        //circumference
        System.out.printf("Circumference : %.2f\n", (2*PI*radius));

        //area
        System.out.printf("Area : %.2f\n", (PI*radius*radius));
    }
    
}
