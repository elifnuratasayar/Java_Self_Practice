package day09_practice_task;

import java.util.Arrays;

public class GroceryItems {
    public static int[] reserveItem(int[] items){
        int[] reserveItem=new int[items.length];
        for (int i = items.length - 1,j=0; i >= 0; i--,j++) {
            reserveItem[j]=items[i];}
            return reserveItem;


    }
    public static void main(String[] args) {
        //Given the following array
        String[] [] items={
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

    }
}
