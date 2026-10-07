import java.util.Scanner;

public class maximumAmongThreeNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 1st num : ");
        a = sc.nextInt();
        System.out.println("Enter 2nd num : ");
        b = sc.nextInt();
        System.out.println("Enter 3rd num : ");
        c = sc.nextInt();
        int max = a > b ? (a > c ? a : c) : b > c ? b : c;
        System.out.println("The great numberv is " + max);
    }
}