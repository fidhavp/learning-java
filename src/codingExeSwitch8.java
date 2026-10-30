//takes an integer (1 to 12) representing a month number and prints the corresponding month name

import java.util.Scanner;

public class codingExeSwitch8 {
    static void main() {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number from 1 to 9");
                int num=sc.nextInt();
                String month=switch (num){
                    case 1 ->"january" ;
                    case 2 ->"February" ;
                    case 3 ->"march" ;
                    case 4 ->"april" ;
                    case 5 ->"may" ;
                    case 6 ->"june" ;
                    case 7 ->"july" ;
                    case 8 ->"august" ;
                    case 9 ->"september" ;
                    case 10 ->"october" ;
                    case 11 ->"november" ;
                    case 12 ->"december" ;
                    default -> "Invalid month number";
                };
                System.out.println(month);
            }
    }

