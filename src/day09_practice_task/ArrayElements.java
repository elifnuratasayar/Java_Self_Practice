package day09_practice_task;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        int numbersLenght = numbers.length;
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");

        }
        int[] reversedArray = new int[numbers.length];
        for (int i = reversedArray.length ; i >= 0; i--) {

            System.out.print("\n"+i);

        }
    }

        }





