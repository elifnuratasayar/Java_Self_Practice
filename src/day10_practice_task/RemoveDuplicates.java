package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Array list
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        ArrayList<Integer>newList=new ArrayList<>();
        for (Integer i : list) {
            if (!(newList.contains(i)))
            {newList.add(i);
            }

        }
        System.out.println(newList);
    }
}
