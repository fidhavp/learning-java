import java.util.Scanner;

public class checkingEqualitywithoutEquality {
    static void main() {
        int a,b,equality;
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        if ((a^b)==0){
            System.out.println("Both numbers are equal");
        }else {
            System.out.println("Both numbers are not equal");
        }



    }
}
