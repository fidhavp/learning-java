import java.util.Scanner;

public class WhileLoopDemo2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
        int choice;
        while(true){
            System.out.println("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n5 for Modulus\n6 for Exit\nEnter your choice : ");
            choice=sc.nextInt();
            if(choice==6){
                System.out.println("Exiting program.....");
                break;
            }
            if(choice>=1&&choice<=5){
                System.out.println("Enter 2 number");
            int a = sc.nextInt();
            int b = sc.nextInt();


            if (choice == 1) {
                int add = a + b;
                System.out.println(add);
            } else if (choice == 2) {
                int sub = a - b;
                System.out.println(sub);
            } else if (choice == 3) {
                int mul = a * b;
                System.out.println(mul);
            }  else if (choice == 4) {
                if (b != 0) {
                    double div = a / b;
                    System.out.println(div);
                } else {
                    System.out.println("Division by zero undefined");
                }
            } else if (choice == 5) {
                if(b!=0) {
                    double mod = a % b;
                    System.out.println(mod);
                }else{
                    System.out.println("invalid number");
                }
            }
        }else{
                System.out.println("Enter valid choice");
            }
        }
        System.out.println("you are out of progrm");
        sc.close();
    }
}
