import java.util.Scanner;
public class Act_05_11 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number : ");
        num = s.nextInt();

        int sum = addRec(num);
        System.out.println("Sum = " + sum);
    }

    public static int addRec(int n) {
        if (n != 0)
            return n + addRec(n - 1);
        else
            return n;
    }
}
