package day06_practice_task;

public class DayAndMethod {
    public static void main(String[] args) {
        System.out.println(day(5));
        System.out.println(month(7));
    }

    public static int day(int a) {

        if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else if (a == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Number");
        }
        return a;}

        public static int month(int b ){
            if (b == 1) {
                System.out.println("January");
            } else if (b == 2) {
                System.out.println("February");
            } else if (b == 3) {
                System.out.println("March");
            } else if (b == 4) {
                System.out.println("April");
            } else if (b == 5) {
                System.out.println("May");
            } else if (b == 6) {
                System.out.println("June");
            } else if (b == 7) {
                System.out.println("July");
            }
            if (b == 8) {
                System.out.println("August");
            } else if (b == 9) {
                System.out.println("September");
            } else if (b == 10) {
                System.out.println("Sunday");
            } else if (b == 11) {
                System.out.println("October");
            } else if (b == 12) {
                System.out.println("November");
            } else {
                System.out.println("Invalid");
            }
            return b;
        }
    }






