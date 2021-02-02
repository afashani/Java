import java.util.Scanner;
public class Act_05_09 {

    public static void addition(int n1,int n2){
        int sum;
        sum = n1 + n2;
        System.out.printf("Sum = %d",sum);

    }
    public static void subtraction(int n1,int n2){
        int diff;
        diff = n1 - n2;
        System.out.printf("Difference = %d",diff);

    }
    public static void division(int n1,int n2){
        int quo,rem;
        quo = n1 / n2;
        rem = n1 % n2;

        System.out.printf("Quotient = %d\nRemainder = %d",quo,rem);

    }
    public static void multiplication(int n1,int n2){
        int prod;
        prod = n1 + n2;
        System.out.printf("Product = %d",prod);

    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        int num1, num2;
        char operator;

        System.out.print("First Number : ");
        num1 = n.nextInt();
        System.out.print("Second Number : ");
        num2 = n.nextInt();
        System.out.print("Operator : ");
        operator = op.nextLine().charAt(0);

        if(operator == '+'){
            addition(num1,num2);
        }else if(operator == '-'){
            subtraction(num1,num2);
        }else if(operator == '/'){
            division(num1,num2);
        }else if(operator == '*'){
            multiplication(num1,num2);
        }else
            System.out.print("Invalid Operator !");
    }
}
