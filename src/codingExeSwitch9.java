//evaluates and print the price of a drink based on its type

import java.util.Scanner;

public class codingExeSwitch9 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter drink type (Coffee, Tea, Juice, Water): ");
        String drink = sc.nextLine();

        int price = switch (drink.toLowerCase()) {
            case "coffee" -> 50;
            case "tea" -> 30;
            case "juice" -> 70;
            case "water" -> 20;
            default -> -1;
        };

        if (price == -1) {
            System.out.println("Invalid drink");
        } else {
            System.out.println("Price: ₹" + price);
        }
    }
}
