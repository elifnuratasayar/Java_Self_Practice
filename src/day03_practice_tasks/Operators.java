package day03_practice_tasks;

public class Operators {
    public static void main(String[] args) {
    int x =8;
    int y = x--;
        System.out.println(y); //8

       int a= 2;
       System.out.println(--a);//1
     int   b = 2;
        System.out.println(b++);//2

        int c= 2;
       int d = c++;
       System.out.println(d); // 2


        int e = 10;
        e = --e + e++ + e-- + e++;
        System.out.println(e);

        int m = 4;
        int n = --m * 4 - m++;
        System.out.println("n = " + n);
        System.out.println("m = " + m);


    }
    }


