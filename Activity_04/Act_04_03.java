import java.util.Scanner;
public class Act_04_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Marks of 10 students :");
        int marks[] = new int[10];

        for(int i = 0; i < 10; i++){
            marks[i] = s.nextInt();
        }
        int count = 0;
        for(int i=0;i<marks.length;i++){
            if(marks[i] >= 85){
                count++;
            }
        }
        System.out.printf("There are %d students who scored above 85 : ",count);
    }
}
