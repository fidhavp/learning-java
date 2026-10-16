//number of days in a month

import java.util.Scanner;

public class codingExeSwitch3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a month (1-12)");
        int month=sc.nextInt();
        String days=switch (month){
            case 1,3,5,7,8,10,12-> "31 days";
            case 4,6,9,11 -> "30 days";
            case 2 -> {
                System.out.println("Enter year : ");
                int year=sc.nextInt();
                if(year%400==0 || (year%4==0 && year%100!=0)){
                    yield"Leap year";
                }else {
                    yield"Not a leap year";
                }
            }
            default -> "invalid number";
        };
        System.out.println(days);
    }

}
