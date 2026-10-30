// takes an integer between 1 and 9 as input and prints the corresponding word

import java.util.Scanner;

public class codingExeSwitch7 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 9");
        int num=sc.nextInt();
        String word=switch (num){
            case 1 ->"One" ;
            case 2 ->"Two" ;
            case 3 ->"Three" ;
            case 4 ->"Four" ;
            case 5 ->"Five" ;
            case 6 ->"Six" ;
            case 7 ->"Seven" ;
            case 8 ->"Eight" ;
            case 9 ->"Nine" ;
            default -> "Invalid input";
        };
        System.out.println(word);
    }
}
