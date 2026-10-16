import java.util.Scanner;

public class switchEnhacementDemo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days 1 to 7");
        int day=sc.nextInt();
        switch (day){
            case 1,2,3,4,5-> System.out.println("Weekday");

            case 6,7-> System.out.println("Weekend");

            default->
                System.out.println("invalid number");
        }
    }
}
