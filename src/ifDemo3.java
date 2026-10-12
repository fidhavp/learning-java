import java.util.Scanner;

public class ifDemo3 {
    static void main() {
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if (number>0){
            System.out.println("positive");
        }
        if(number%2==0){
            System.out.println("even");
        }
        if(number==0){
            System.out.println("zero");
        }
    }
}
