public class Act_02_15 {

    String name;
    int age;
    float height;
    char gender;

    Act_02_15(String n,int a,float h,char g){
        name = n;
        age = a;
        height = h;
        gender = g;
    }

    public static void main(String[] args) {

        Act_02_15 student1 = new Act_02_15("Kamal",23,156.4f,'m');
        Act_02_15 student2 = new Act_02_15("Achala",25,150.6f,'f');
        Act_02_15 student3 = new Act_02_15("Kumara",22,160.3f,'m');
        Act_02_15 student4 = new Act_02_15("Thisari",23,146.4f,'f');
        Act_02_15 student5 = new Act_02_15("Dinuka",22,162.3f,'m');

        System.out.println("\n***Student Details***\n");
        System.out.printf("Student 01 \nName : %s\nAge : %d\nHeight : %.2f\nGender : %c\n\n",student1.name,student1.age,student1.height,student1.gender);
        System.out.printf("Student 02 \nName : %s\nAge : %d\nHeight : %.2f\nGender : %c\n\n",student2.name,student2.age,student2.height,student2.gender);
        System.out.printf("Student 03 \nName : %s\nAge : %d\nHeight : %.2f\nGender : %c\n\n",student3.name,student3.age,student3.height,student3.gender);
        System.out.printf("Student 04 \nName : %s\nAge : %d\nHeight : %.2f\nGender : %c\n\n",student4.name,student4.age,student4.height,student4.gender);
        System.out.printf("Student 05 \nName : %s\nAge : %d\nHeight : %.2f\nGender : %c\n\n",student5.name,student5.age,student5.height,student5.gender);

    }
    
}
