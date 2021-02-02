public class Act_03_09 {
    public static void main(String[] args) {
        //Addition of all the numbers from 1 to 10.
        int summ = 0;
        for(int i = 1; i <= 10; ++i)
        {
            summ += i;
        }

        System.out.println("Sum of all the numbers from 1 to 10= " + summ);

    //Multiplication of all the numbers from 1 to 10.
        int prod = 1;
        for(int j = 1; j <= 10; ++j)
        {
            prod *= j;
        }

        System.out.println("Product of all the numbers from 1 to 10 = " + prod);

    //Number of even numbers from 1 to 50.
        int counteven = 0;
        for (int k = 1; k <= 50; k++) {
            
            if (k % 2 == 0) {
                counteven++;
            }
         }
        System.out.println("Number of even numbers from 1 to 50 = "+counteven);
    //Number of odd numbers from 1 to 50.
        int countodd = 0;
        for (int l = 1; l <= 50; l++) {
        
        if (l % 2 == 1) {
            countodd++;
        }
     }
        System.out.println("Number of odd numbers from 1 to 50 = "+countodd);

    }
}
