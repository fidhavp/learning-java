import java.util.Scanner;

public class numberSwap {
    static void main() {
//        int a,b;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first number");
//        a=sc.nextInt();
//        System.out.println("Enter second number");
//        b=sc.nextInt();
//        System.out.println("The swapped number is "+b+ "\n" +a);

        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+ "\n" +b);
    }
}
