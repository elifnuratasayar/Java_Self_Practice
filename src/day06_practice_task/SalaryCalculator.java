package day06_practice_task;

public class SalaryCalculator {
    public static void main(String[] args) {
        double income= salary(45,40);
        System.out.println(income);
    }


    public static double salary(double hourlyTake, int weeklyHours){
        return hourlyTake*weeklyHours*52;
    }
}
