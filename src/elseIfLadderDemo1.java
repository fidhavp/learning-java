import java.util.Scanner;

public class elseIfLadderDemo1 {
    static void main() {
        System.out.println("Enter your marks btw 0 and 100 ");
        Scanner sc=new Scanner(System.in);
        float mark=sc.nextFloat();
        if(mark<0 || mark>100){
            System.out.println("invalid!!!  Enter valid mark ( Between 0 - 100 )");
        }else {
            if (mark <= 100 && mark > 90) {
                System.out.println("Grade A");
            } else if (mark <= 90 && mark >= 80) {
                System.out.println("Grade B");
            } else if (mark <= 80 && mark >= 70) {
                System.out.println("Grade C");
            } else if (mark <= 70 && mark >= 60) {
                System.out.println("Grade D");
            } else if (mark <= 60 && mark >= 50) {
                System.out.println("Grade E");
            } else {
                System.out.println("Failed");
            }
        }
    }
}
