package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        //Array list and print
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        // find max and min
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
