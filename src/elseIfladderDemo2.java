import java.util.Scanner;

public class elseIfladderDemo2 {
    static void main() {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        if(num==0){
            System.out.println("zero");
        }else if(num<0){
            System.out.println("negative");
        }else if(num>0){
            System.out.println("positive");
        }
    }
}
