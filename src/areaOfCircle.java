import java.util.Scanner;

public class areaOfCircle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        final double pi=3.14;
        System.out.println("Enter the raduis : ");
        float a=sc.nextFloat();
        double area=pi*a*a;
        double circumference=2*pi*a;
        System.out.println("Area of circle = "+area);
        System.out.println("Circumference of circle = "+circumference);

    }
}
