package day07_practice_task;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" please write your miles ");
        double mile= input.nextDouble();
         double km= mile*1.609;
         input.close();
        System.out.println(mile+" miles is equal to "+km+" kilometers");
    }
}
