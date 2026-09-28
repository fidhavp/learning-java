import java.util.Scanner;

public class areaOfRectangle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        float a = sc.nextFloat();
        System.out.println("Enter height of rectangle : ");
        float b = sc.nextFloat();
        float c = a * b;
        System.out.println("Area of Rectangle is " + c);

    }
}