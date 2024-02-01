package day09_practice_task;

import java.util.Arrays;

public class EvenOddNumbers {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7,};
        System.out.println(Arrays.toString(array));
        int even=0;
        int odd=0;
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        System.out.println(even+" even numbers and "+odd+" odd number ");
        }
    }
