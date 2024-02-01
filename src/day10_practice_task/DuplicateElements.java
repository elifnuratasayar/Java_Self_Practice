package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateElements {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
// print list
        System.out.println(list);
        // add list
        list.addAll(list);
        // print list
        System.out.println(list);
    }
}
