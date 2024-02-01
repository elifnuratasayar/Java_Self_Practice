package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        ArrayList<Integer>even= new ArrayList<>();
        for (Integer i : list) {
            if (i%2==0){
                even.add(i);
            }

        }
        System.out.println(even);

    }
}
