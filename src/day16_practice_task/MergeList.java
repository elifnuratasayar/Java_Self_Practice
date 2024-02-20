package day16_practice_task;

import java.util.*;

public class MergeList {

    public static void main(String[] args) {
        // step 1 list 1 list 2 list 3
        List<Integer> list1= new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        List<Integer>list2= new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));
        Queue<Integer>list3=new PriorityQueue<>();
        //  step 2print list 1 and list 2
        System.out.println(list1);
        System.out.println(list2);
        // step 3 add list3 list 1 and list 2
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("first list "+list3);
// step  8
        removeDuplicate(list3);
        System.out.println("Remove list= "+list3);



    }

    public static void removeDuplicate(Queue<Integer>list3){ // step 4 create remov dup
        Queue<Integer> uniquequeue= new PriorityQueue<>();
        // step 5 for each loop
        for (Integer each : list3) {
            // step 6 check if condtions
            if(uniquequeue.contains(each)){
                continue; // skip
            } uniquequeue.add(each);
        }
        // step 7
        list3.clear();
        list3.addAll(uniquequeue);
    }
}

/*
. Create a class named MergeLists and write a program that merges two given lists of integers into a third list. Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}

 */