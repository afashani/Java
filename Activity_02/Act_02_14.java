public class Act_02_14 {


    String name = "Ashani";
    int age = 23;
    float height = 146.4f;
    char gender = 'f';

    public static void main(String[] args) {
        
        Act_02_14 student = new Act_02_14();
        System.out.println("\n***Student Details***\n");
        System.out.printf("%s \n%d \n%.2f \n%c\n",student.name,student.age,student.height,student.gender);

    }
}
