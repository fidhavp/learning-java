//implement a simple calculator that performs addition or sub based on user input

import java.util.Scanner;

public class ifElseDemo3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int number1,number2,choice;
        System.out.println("enter 1 for addition");

        System.out.println("enter your choice");
        choice=sc.nextInt();
        System.out.println("Enter first number : ");
        number1=sc.nextInt();
        System.out.println("Enter second number : ");
        number2=sc.nextInt();

        if(choice==1){
            int sum=number1+number2;
            System.out.println("Addition is "+sum);
        }else{
            int sub=number1-number2;
            System.out.println("Subtraction is "+sub);
        }



    }
}
