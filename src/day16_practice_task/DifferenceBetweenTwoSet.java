package day16_practice_task;

import java.util.*;


public class DifferenceBetweenTwoSet {
    public static void main(String[] args) {
        // step 1 set 1 and set2  and print both

        Set<Integer> set1= new TreeSet<>(Arrays.asList(1, 2, 3,5));
        Set<Integer>set2= new TreeSet<>(Arrays.asList(2, 3, 4));
        System.out.println(set1);
        System.out.println(set2);
        // step 3 crete set 3 and add set1 and set2

        Set <Integer> set3= new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        // remove set 2
        set3.removeAll(set2);
        System.out.println(set3);

        }


            }







/*
reate a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}
 */