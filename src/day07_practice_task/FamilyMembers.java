package day07_practice_task;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people they live with?");
        int num = input.nextInt();
        if (num < 3) {
            System.out.println("Live with less than three people");
        } else if (num >= 3 && num < 6) {
            System.out.println("Live with 3-6 people.");

        } else {
            System.out.println("Live with more than six people ");
        }
        input.close();

    }
}
