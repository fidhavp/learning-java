import java.util.Scanner;

public class codingExeSwitch6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter your choice : \n1.Add\n2.Sub\n3.Mul\n4.div\n5.Modulus");
        int choice=sc.nextInt();
         switch (choice) {
            case 1 -> {
                int add=num1+num2;
                System.out.println(add);
            }
            case 2 -> {
                int sub=num1-num2;
                System.out.println(sub);
            }
            case 3 -> {
                int mul=num1*num2;
                System.out.println(mul);
            }
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("not divisble by zero");
                } else {
                    int div = num1 / num2;
                    System.out.println(div);
                }
            }
            case 5 -> {
                if (num2 == 0) {
                    System.out.println("Cannot calculate modulus by zero");
                } else {
                    int mod = num1 % num2;
                    System.out.println(mod);
                }
            }
            default -> {
                System.out.println("invalid choice");
            }
        };
    }
}
