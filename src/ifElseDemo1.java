import java.util.Scanner;

public class ifElseDemo1 {
    static void main() {
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if (number>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
