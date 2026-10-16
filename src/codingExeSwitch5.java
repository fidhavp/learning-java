import java.util.Scanner;

public class codingExeSwitch5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();
        String light=switch (num%2){
            case 0-> "Even";
            case 1,-1 -> "Odd";
            default -> "invalid number";
        };
        System.out.println(light);
    }
}
