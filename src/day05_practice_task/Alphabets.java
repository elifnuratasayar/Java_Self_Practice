package day05_practice_task;

public class Alphabets {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E'; i++) {
            for (char j = 'a'; j <= 'z' ; j++) {
                System.out.print(i);
                System.out.print(j);
                System.out.print("  ");
            }
            System.out.println();

        }
    }
}
