import java.util.Scanner;
public class Act_05_12 {
    public static void main(String[] args) {
        int base,index;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the base : ");
        base = s.nextInt();
        System.out.print("Enter the index : ");
        index = s.nextInt();

        int val = power(base,index);

        System.out.printf("%d to the power %d = %d", base, index, val);
    }

    public static int power(int b, int i) {
        if (i != 0)
            return (b * power(b, i - 1));
        else
            return 1;
    }
}
