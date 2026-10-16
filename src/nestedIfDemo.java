import java.util.Scanner;

public class nestedIfDemo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        if(age>=18){

            System.out.println("Are you indian ?  (Yes / No )");
            String citizenShip=sc.next();

            if(citizenShip.equals("Yes")){
                System.out.println("You are eligible to vote !!!");
            }else{
                System.out.println("You are not eligible ");
            }
        }else{
            System.out.println("You are not eligible !!!");
        }
    }
}
