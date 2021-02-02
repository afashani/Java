import java.util.Scanner;
public class Act_05_04 {

    public static void diameter(Float radius){

        System.out.printf("Diameter : %.2f\n", (2*radius));
    }

    public static void circumference(Float radius){

        final float PI = 3.14f;
        System.out.printf("Circumference : %.2f\n", (2*PI*radius));
    }
    public static void area(Float radius){

        final float PI = 3.14f;
        System.out.printf("Area : %.2f\n", (PI*radius*radius));
    }
    public static void main(String[] args) {
        float r;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter radius : ");
        r = s.nextFloat();
        diameter(r);
        circumference(r);
        area(r);

        }
    
}
