import java.util.Scanner;

public class productOf_2_FloatingPoint {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 : ");
        float a=sc.nextFloat();
        System.out.println("Enter num2 : ");
        float b=sc.nextFloat();
        System.out.println("Product of Numbers = "+a+ " * " +b);
        double c=a*b;
        System.out.println("\t\t\t= "+c);

    }
}
