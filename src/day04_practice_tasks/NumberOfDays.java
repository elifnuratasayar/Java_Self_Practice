package day04_practice_tasks;

public class NumberOfDays {
    public static void main(String[] args) {
        int x =5;
        String Month;
        switch (x){
            case 1,3,5,7,8,10,12 -> Month=" 31 Days ";
            case 4,6,9,11 -> Month= "30 Days";
            default -> Month= "invalid";
        }
        System.out.println(Month);
    }
}
