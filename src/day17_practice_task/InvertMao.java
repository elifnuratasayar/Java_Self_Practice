package day17_practice_task;

import java.util.HashMap;
import java.util.Map;

public class InvertMao {
    public static void main(String[] args) {
        // step 1  create map
        Map<Integer,Character> map= new HashMap<>();
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');
        System.out.println(map);
        Map<Character,Integer> newMap= new HashMap<>();
        // step 2 for each key value value key

        for (Map.Entry<Integer, Character> intchar : map.entrySet()) {
            newMap.put(intchar.getValue(),intchar.getKey());
        }
        System.out.println(newMap);
    }
}
/*
Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}


         Output:
               {"a"=1, "b"=2, "c"=3}

 */