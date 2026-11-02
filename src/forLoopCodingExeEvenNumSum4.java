// sum of even numbers between 1 and N

import java.util.Scanner;

public class forLoopCodingExeEvenNumSum4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        if (num < 0) {
            System.out.println("Invalid number!!!");
        } else {
//            for (int i = 0; i <= num; i = i + 2) {
//                sum += i;
//            }System.out.println(sum);
            for (int i = 2; i < num; i = i + 2) {
                sum += i;
            }System.out.println(sum);

        }
    }
}

