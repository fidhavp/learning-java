import java.util.Scanner;

public class areaOfTriangle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of rectangle : ");
        float a = sc.nextFloat();
        System.out.println("Enter height of rectangle : ");
        float b = sc.nextFloat();
        float c =(float) (0.5 * a * b);
        System.out.println("Area of Triangle is " + c);
    }
}