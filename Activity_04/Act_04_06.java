import java.util.Scanner;
public class Act_04_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float marks[][] = new float[5][4]; 
        //i-> rows(students)=5
        //j-> columns(subjects)=4
        for(int i = 0; i < 5; i++){
            System.out.printf("Student %d marks for 4 subjects :\n",i+1);
            for(int j=0;j<4;j++){

                marks[i][j] = s.nextFloat();
            }
            System.out.println();
        }
        System.out.println("\t**Data**");
        for(float []x:marks){
            for(float y:x){
            System.out.print(y+"\t");
            }
            System.out.println();
        }
    }
}
