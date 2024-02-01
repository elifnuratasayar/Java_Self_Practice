package day09_practice_task;

import java.util.Arrays;

public class MoveToZeros {
    public static void main(String[] args) {
        int[] array={10,0,5,0,1,0};
        Arrays.sort(array);
        int lenght= array.length;
        for (int i=array.length-1; i>=0  ; i--) {
            System.out.print(array[i]+" ");

        }


    }


}
