//traffic light simulation

import java.util.Scanner;

public class codingExeSwitch4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a color of traffic light");
        String color=sc.nextLine();
        String light=switch (color){
            case "Red"-> "Stop";
            case "Yellow" -> "Be Ready";
            case "Green" -> "Go";
            default -> "invalid color";
        };
        System.out.println(light);
    }

}



