package day05_practice_task;

public class FactorialNumber {
    public static void main(String[] args) {
        int fac=1;
        int y=5;

        for (int i = 1; i <=y; i++) {
            fac *=i;
        }
        System.out.println("fac = " + fac);
    }
}
