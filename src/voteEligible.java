import java.util.Scanner;

public class voteEligible {
    static void main() {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("He is eligible to vote");
        } else {
            System.out.println("He is not eligible to vote");
        }

    }

}