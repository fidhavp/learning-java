import java.util.Scanner;

public class evenOrOddWithBitwise {
    static void main() {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        a=sc.nextInt();
        if((a & 1) == 0){
            System.out.println("Its even");
        }else{
            System.out.println("its odd");
        }
    }
}
