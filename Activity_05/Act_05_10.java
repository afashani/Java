import java.util.Scanner;
public class Act_05_10 {
    
    public static float average(int m[]){
        float sum=0;
        float avg;
        for(int i = 0; i < 5; i++){
            sum = sum + m[i];
        }
        avg = sum/m.length;
        System.out.printf("Average = %.2f\n",avg);
        return avg;
    }
    public static void grade(float a){
        if (a >= 75 && a <=100 ){
            System.out.println("Grade : A");
         } else if(a >= 55){
            System.out.println("Grade : C");
         } else if(a >= 65){
            System.out.println("Grade : B");
         } else if(a >= 55){
            System.out.println("Grade : C");
         } else if(a >= 45){
            System.out.println("Grade : D");
         } else if(a >= 35){
            System.out.println("Grade : E");
         } else if(a < 35){
            System.out.println("Grade : F");
         }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter marks for \nQuiz 01\nQuiz 02\nSpot Test 01\nSpot Test 02\nAssignment 01:");
        int marks[] = new int[5];

        for(int i = 0; i < 5; i++){
            marks[i] = s.nextInt();
        }

        float a=average(marks);
        grade(a);
    }

    
}
