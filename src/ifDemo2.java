import java.util.Scanner;

public class ifDemo2 {
    static void main() {
        int age;
        System.out.println("Enter your age : ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=65){
            System.out.println("you are eligible for senior discount");
        }
    }
}
