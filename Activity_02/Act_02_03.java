import java.util.Scanner;
public class Act_02_03 {
    public static void main(String[] args) {
        float length,height;
        Scanner s = new Scanner(System.in);
        
        //getting inputs
        System.out.print("Input the Length : ");
        length = s.nextFloat();
        System.out.print("Input the Height : ");
        height = s.nextFloat();

        //output area

        System.out.printf("Area of the tariangle : %.2f", (0.5*length*height));


    }   
}
