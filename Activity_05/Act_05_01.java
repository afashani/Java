public class Act_05_01 {
    public static int largestNumber(int n1, int n2){
        int max = n1 > n2? n1 : n2;
        return max;
    }
    public static void main(String[] args) {
        int largest = largestNumber(8, 10);
        System.out.println("Largest number is " + largest);
    }
    
}
