package day08_practice_task;

import java.util.Scanner;

public class CofffeeOrderApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Order App!");
        System.out.println("Would you like to order coffee?");

        String answer = scan.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("1. Black Coffee: $4\n2. Latte: $5\n3. Cappuccino: $5");
            System.out.println("Please select a coffee");
            int x = scan.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Added Black Coffee to Your Order");
                    break;
                case 2:
                    System.out.println("Added Latte to Your Order");
                    break;
                case 3:
                    System.out.println("Added Cappuccino to Your Order");
                    break;
                default:
                    System.out.println("Your choice is invalid, please re-enter");
            }
        } else if (answer.equals("no")) {
            System.out.println("Thanks for using our service");
        } else {
            System.out.println("Invalid input, please re-enter");
        }

        System.out.println("Would you like to order another coffee?");
        scan.nextLine(); // Consume the newline character
        String answer2 = scan.nextLine().toLowerCase();

        if (answer2.equals("yes")) {
            System.out.println("1. Black Coffee: $4\n2. Latte: $5\n3. Cappuccino: $5");
            System.out.println("Please select a coffee");
            int y = scan.nextInt();

            switch (y) {
                case 1:
                    System.out.println("Added Black Coffee to Your Order");
                    break;
                case 2:
                    System.out.println("Added Latte to Your Order");
                    break;
                case 3:
                    System.out.println("Added Cappuccino to Your Order");
                    break;
                default:
                    System.out.println("Your choice is invalid, please re-enter");
            }
        } else {
            System.out.println("Your total price is ");
        }
    }
}
