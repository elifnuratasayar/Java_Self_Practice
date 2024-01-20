package day07_practice_task;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner place= new Scanner(System.in);
        System.out.println("could you write product name ");
        String productName= place.next();
        System.out.println("could you write price");
        double price= place.nextDouble();
        System.out.println(" could you write quantitity ");
        int quantitty = place.nextInt();
        double total= quantitty*price;
        System.out.println(" what is your first name ");
        String firstName= place.next();

        place.close();
        System.out.println( firstName+ " your order for " + quantitty+" "+productName+" has been placed. Your total is "+ total);
    }
}
