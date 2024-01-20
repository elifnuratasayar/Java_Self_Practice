package day07_practice_task;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Could you write score , please");
        int score = input.nextInt();
        if (score >= 85) {
            System.out.println("Your grade is B");
        } else if (score < 85) {
            System.out.println("Fail");
        } else {
            System.out.println("Incorrect data");
        }
        input.close();

    }
    }
