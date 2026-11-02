//factorial of a number

import java.util.Scanner;

public class forLoopCodingExeFactorial2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to see factorial");
        int num=sc.nextInt();
        int factorial=1;
        if(num<0){
            System.out.println("Invalid number!!!");
        }else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            } System.out.println(factorial);
        }
       }
}



