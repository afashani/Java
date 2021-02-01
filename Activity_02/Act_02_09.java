import java.util.Scanner;
public class Act_02_09 {
    public static void main(String[] args) {
        int input_seconds,hours,minutes,seconds;

        Scanner s = new Scanner(System.in);

        System.out.print("Input seconds : ");
        input_seconds = s.nextInt();

    //calculations

        //find hours
        hours = input_seconds/3600 ;

        //find minutes
        minutes = (input_seconds%3600)/60;

        //find seconds
        seconds = (input_seconds%3600)%60;

    //output
        System.out.printf("Hours\t: %02d \n",hours);
        System.out.printf("Minutes\t: %02d \n",minutes);
        System.out.printf("Seconds\t: %02d \n",seconds);
        
    }
    
}
