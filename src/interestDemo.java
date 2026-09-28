import java.util.Scanner;

public class interestDemo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("The Principal amount : ");  //amount of money borrowed or invested.
        int a=sc.nextInt();
        System.out.println("Rate : ");                 //interest rate per year, usually given as a percentage. eg:bank gives 5% interest per year, so r=5.
        int b=sc.nextInt();
        System.out.println("Time : ");
        int c=sc.nextInt();
        System.out.println(" Interest = ( principal amount * rate * time ) / 100 ");
        System.out.println("\t\t= "+a+"*" +b+"*"+c+"/" +"100");
        int d=a*b*c;
        float e=d/100f;
        System.out.println("\t\t="+e);
    }
}
