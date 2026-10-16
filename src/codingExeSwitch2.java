//convert to switch exp

import java.util.Scanner;

public class codingExeSwitch2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int mark=sc.nextInt();
        if(mark<=0 || mark>=100){
            System.out.println("invalid mark");
        }else {
            char score = switch (mark / 10) {
                case 10 ->{
                    System.out.println("your marks are "+mark);
                    yield'A';
                }
                case 9 -> {
                    System.out.println("your marks are "+mark);
                    yield'B';
                }
                case 8 -> {
                    System.out.println("your marks are "+mark);
                    yield 'C';
                }
                case 7 -> {
                    System.out.println("your marks are "+mark);
                    yield'D';
                }
                case 6 -> {
                    System.out.println("your marks are "+mark);
                    yield'E';
                }
                default -> {
                    System.out.println("your marks are "+mark);
                    yield'F';
                }
            };
            System.out.println("You got grade "+score);
        }
     }
}

