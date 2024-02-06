package day04_practice_tasks;

public class MedianNumber {
    public static void main(String[] args) {
        int x= 1;//3
        int y=2;//2
        int z= 3;//1
        String medianNumber;
        if ((x<y && x>z) || (x<z && x>y)){System.out.println("MedianNumber is" +x);}
        else if ((y<x && y>z)||(y>x && y<z)) {
            System.out.println("Median number is " +y);}
        else {
            System.out.println("Median number is "+z);
        }

    }
}
