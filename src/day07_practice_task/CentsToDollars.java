package day07_practice_task;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Could you write your cents ");
        double cent= input.nextDouble();
        double dolars= cent/1000 + cent%100;
        input.close();
        System.out.println(cent+ " cent is equal to "+ dolars);

    }
}
