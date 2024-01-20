package day04_practice_tasks;

public class MedianNumber {
    public static void main(String[] args) {
        int x= 70;
        int y=10;
        int z= 34;
        String medianNumber;
        if ((x<y && x>z)) {System.out.println("MedianNumber is" +x);}
        else if ((y<x && y>z)) {
            System.out.println("Median number is " +y);}
        else {
            System.out.println("Median number is"+z);
        }

    }
}
