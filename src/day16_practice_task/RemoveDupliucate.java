package day16_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDupliucate {
    public static void main(String[] args) {
        // step 1 create integer list
        List<Integer>list= new ArrayList<>(Arrays.asList( 20, 15, 10, 20, 30, 10, 20, 15, 0));
        // step 2 print  first list
        System.out.println("First List= "+list);
        // step 7 call remo.
        removeDuplicates(list);
        // step 8 print rem. list
        System.out.println("Remove List="+list);

    }


    // step 3 create Remov. Dup.
    public static void removeDuplicates(List<Integer>list){
        List<Integer>uniqueNumbers= new ArrayList<>();
        // step 4 for each loop
        for (Integer each : list) {
            // step 5 if condition
            if (!uniqueNumbers.contains(each)) {
             uniqueNumbers.add(each);
            }

        }
        // step 6
        list.clear(); // clean you list
        list.addAll(uniqueNumbers); // add only unique numbers

    }
}
 /*
 1. Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
  */