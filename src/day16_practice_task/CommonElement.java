package day16_practice_task;

import java.util.*;

public class CommonElement {

    public static void main(String[] args) {
        // step 1 set1 and set 2 also print
        List<Integer> set1= new ArrayList<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        List<Integer> set2 = new ArrayList<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
        System.out.println(set1);
        System.out.println(set2);
        // setp 2 set 3
        Set<Integer>set3= new TreeSet<>();
        for (Integer each : set1) {
            for (Integer i : set2) {
                if (i== each){
                    set3.add(each);
                }
            }

        }
        System.out.println("Set 3= "+set3);

    }
}
/*
Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}

 */