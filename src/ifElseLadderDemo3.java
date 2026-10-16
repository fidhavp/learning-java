import java.util.Scanner;

public class ifElseLadderDemo3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int number1,number2,choice;
        System.out.println("enter 1 for addition");
        System.out.println("enter 2 for subtraction");
        System.out.println("enter 3 for multiplication");
        System.out.println("enter 4 for division");
        System.out.println("Enter your choice :");
        choice=sc.nextInt();



        if(choice>0 && choice<5) {
            System.out.println("Enter first number : ");
            number1=sc.nextInt();
            System.out.println("Enter second number : ");
            number2=sc.nextInt();


            if (choice == 1) {
                float add = number1 + number2;
                System.out.println(add);
            } else if (choice == 2) {
                float sub = number1 - number2;
                System.out.println(sub);
            } else if (choice == 3) {
                float mul = number1 * number2;
                System.out.println(mul);
            } else if (choice == 4) {
                float div = number1 / number2;
                System.out.println(div);
            }
        }else {
            System.out.println("Invalid choice");
        }
    }
}
