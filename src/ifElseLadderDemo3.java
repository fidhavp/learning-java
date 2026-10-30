import java.util.Scanner;

public class ifElseLadderDemo3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int number1,number2;
        char choice;
        System.out.println("Enter first number : ");
        number1=sc.nextInt();
        System.out.println("Enter second number : ");
        number2=sc.nextInt();

        System.out.println("enter + for addition");
        System.out.println("enter - for subtraction");
        System.out.println("enter * for multiplication");
        System.out.println("enter / for division");
        System.out.println("Enter your choice :");
        choice=sc.next().charAt(0);

            if (choice == '+') {
                float add = number1 + number2;
                System.out.println(add);
            } else if (choice == '-') {
                float sub = number1 - number2;
                System.out.println(sub);
            } else if (choice == '*') {
                float mul = number1 * number2;
                System.out.println(mul);
            } else if (choice == '/') {
                if(number2!=0){
                    float div = number1 / number2;
                    System.out.println(div);
                }else{
                    System.out.println("Cannot divide by zero");
                }

            }else{
                System.out.println("Invalid operator");
            }
    }
}
