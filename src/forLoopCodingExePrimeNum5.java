//number is prime or not

import java.util.Scanner;

public class forLoopCodingExePrimeNum5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int prime = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = 0;
                break;
            }
        }
        if(prime==0){
            System.out.println("Its not prime");
        }else{
            System.out.println("Its prime");
        }
    }
}