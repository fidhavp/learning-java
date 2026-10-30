//converts a given integer (1 to 10) into its corresponding Roman numeral

import java.util.Scanner;

public class codingEXeSwitch10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1 to 10): ");
        int num = sc.nextInt();

        String roman = switch (num) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "Invalid input";
        };

        System.out.println(roman);
    }
}
