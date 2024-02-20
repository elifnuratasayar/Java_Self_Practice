package day17_practice_task;

import java.util.*;

public class FrenquencyOfChar {
    public static void main(String[] args) {
        String str= "bbcccaaaaa";
        System.out.println(str);
        Map<Character, Integer> output= new HashMap<>();
        for (char each : str.toCharArray()) {
            if (output.containsKey(each)) {
                output.put(each,output.get(each)+1);
            }else {
                output.put(each,1);
            }

        }
        System.out.println(output);

    }

}
/*
Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}

 */