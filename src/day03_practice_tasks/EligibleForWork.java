package day03_practice_tasks;

public class EligibleForWork {
    public static void main(String[] args) {

        int age = 72;

        boolean isEligible= age >= 18 && age <= 65;
        System.out.println( " Am i eligible to work? " + isEligible);

    }
}
