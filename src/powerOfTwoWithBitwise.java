import java.util.Scanner;

public class powerOfTwoWithBitwise {
    static void main() {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        a=sc.nextInt();
        if((a & a-1)==0){
            System.out.println("its  power of 2");
        }else{
            System.out.println("Not power of two");
        }
    }
}
