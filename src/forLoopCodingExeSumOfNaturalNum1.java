//sum of first n natural numbers

import java.util.Scanner;

public class forLoopCodingExeSumOfNaturalNum1 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum=0;
        if(num>0) {
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }else{
            System.out.println("Invalid number");
        }
    }
}
