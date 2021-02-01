import java.util.Scanner;
public class Act_02_13 {
    public static void main(String[] args) {
        String manufacturer,warranty,colour,display_size;
        String lap_model;
        int USB_ports;
        float price;
        
        Scanner s = new Scanner(System.in);
        Scanner f = new Scanner(System.in);

//getting inputs
        System.out.print("Enter manufacturer : ");
        manufacturer = s.nextLine();

        System.out.print("Enter price : ");
        price = f.nextFloat();

        System.out.print("Enter model : ");
        lap_model = s.nextLine();

        System.out.print("Enter warranty : ");
        warranty = s.nextLine();

        System.out.print("Enter color : ");
        colour = s.nextLine();

        System.out.print("Enter display size : ");
        display_size = s.nextLine();

        System.out.print("Enter USB ports : ");
        USB_ports = s.nextInt();
// outputs
        System.out.printf("Manufacturer's Name : %s\n", manufacturer);
        System.out.printf("Price : %.2f\n", price);
        System.out.printf("Model : %s\n", lap_model);
        System.out.printf("Warranty Period : %s\n", warranty);
        System.out.printf("Colour : %s\n", colour);
        System.out.printf("Display Size : %s\n", display_size);
        System.out.printf("Number of USB Ports : %d\n", USB_ports);





    }
}
