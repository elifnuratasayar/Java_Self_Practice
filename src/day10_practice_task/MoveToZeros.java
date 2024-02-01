package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveToZeros {
    public static void main(String[] args) {
        // Arraylist
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        // 0 up to 4
        Collections.sort(list);
        // 0 upto 4 print
        System.out.println(list);
        // remove
        Collections.rotate(list,-4);
        System.out.println(list);
    }
}
