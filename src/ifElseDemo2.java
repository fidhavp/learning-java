import java.util.Scanner;

public class ifElseDemo2 {
    static void main() {
        System.out.println("Enter first number : ");
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        System.out.println("Enter second number : ");
        int number2=sc.nextInt();

        if (number1>number2){
            System.out.println(number1+" is largest");
        }else{
            System.out.println(number2+" is largest");
        }
    }
}
