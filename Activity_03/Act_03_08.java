public class Act_03_08 {
    public static void main(String[] args) {

    //Display the numbers from 1 to 10 line by line
        System.out.println("\n1 to 10 line by line\n");
        int q1 = 1;
        while(q1 <= 10) {
            System.out.println(q1);
            q1++;
          }
                
    //Display the numbers from 10 to 1 line by line
        System.out.println("\n10 to 1 line by line\n");
        int q2 = 10;
        while(q2 >= 1) {
        System.out.println(q2);
        q2--;
      } 
    
    //Display the sequence 1,3,5,7,9 line by line
        System.out.println("\n1,3,5,7,9 line by line\n");
        int q3 = 1;
        do{
            System.out.println(q3);
            q3+=2;

        }while(q3<10);

    //Display all the odd numbers between 1 to 100
        System.out.println("\nodd numbers between 1 to 100\n");
        int q4 = 1;
        do{
            System.out.println(q4);
            q4+=2;

        }while(q4<100);

    //Display all the even numbers between 1 to 100
        System.out.println("\neven numbers between 1 to 100\n");
        int q5 = 0;
        do{
            q5+=2;
            System.out.println(q5);            

        }while(q5<100);

    //Display all the numbers that are multiple of 3 between 1 to 100.
        System.out.println("\nmultiples of 3 between 1 to 100\n");
        int q6 = 3;
        do{            
            System.out.println(q6);
            q6+=3;
        
        }while(q6<100);
    
    //Display the addition of all the numbers from 1 to 10.
        System.out.println("\naddition of all the numbers from 1 to 10\n");
        int q7 = 1, sum=0;
        while(q7 <= 10) {
            sum += q7;
            q7++;

          }
        System.out.println(sum);

    }
}
