//multiplication table of a number

import java.util.Scanner;

public class forLoopCodingExeMultiTable3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to see multiplication table");
        int num=sc.nextInt();
        int sum=1;
        for(int i=1;i<=10;i++){
            sum=num*i;
            System.out.println(i+" * "+num+" = "+sum);
        }
    }
}
