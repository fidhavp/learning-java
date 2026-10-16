import java.util.Scanner;

public class nestedIfDemo2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int number=sc.nextInt();

        if(number>0){
            if(number%2==0){
                System.out.println("You entered positive number and its Even");
            }else{
                System.out.println("You entered positive number and its Odd");
            }
        }else{
            System.out.println("You entered negative number");
        }
    }
}
