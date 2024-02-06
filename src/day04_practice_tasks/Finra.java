package day04_practice_tasks;

public class Finra {
    public static void main(String[] args) {
        int x = 20;

        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("FINRA");
        } else if (x % 3 == 0) {
            System.out.println("FIN");
        } else if (x % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println(x);}
    }
}