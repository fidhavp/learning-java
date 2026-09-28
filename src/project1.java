import java.util.Scanner;

public class project1 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To YouTube Channel Name Generator!");
        System.out.println("What is your nick name : ");
        String a=sc.nextLine();
        System.out.println(a);
        System.out.println("What is the next word you want to add : ");
        String b=sc.nextLine();
        System.out.println(b);
        System.out.println("Your TB channel name could be "+a+" "+b);
    }
}
