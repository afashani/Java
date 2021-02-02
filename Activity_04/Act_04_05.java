import java.util.Scanner;
public class Act_04_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter salaries of 10 employees :");
        float salary[] = new float[10];

        for(int i = 0; i < 10; i++){
            salary[i] = s.nextFloat();
        }
        int count = 0;
        for(int i=0;i<salary.length;i++){
            if(salary[i] >= 35000 && salary[i] <= 75000){
                count++;
            }
        }
        System.out.printf("There are %d employees who are getting salary between 35000 and 75000 : ",count);
    }
}
