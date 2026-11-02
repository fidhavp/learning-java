import java.util.Scanner;

public class whileLoopDemo1 {
    static void main() {
        System.out.println("enter a number btw 1 - 50");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(num<1||num>50){
            System.out.println("invalid number!! \nEnter btw 1-50");
            num=sc.nextInt();
        }
        System.out.println("you entered "+num);
    }
}
