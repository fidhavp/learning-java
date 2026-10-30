//given number is divisible by both 5 and 13

import java.util.Scanner;

public class elseIfladderDemo4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if(num%5==0 && num%13==0){
            System.out.println("It is divisible by both 5 and 13");
        }else{
            System.out.println("It is not divisible by both 5 and 13");
        }
    }
}
