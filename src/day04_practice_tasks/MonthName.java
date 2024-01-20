package day04_practice_tasks;

public class MonthName {

    public static void main(String[] args) {
        int x= -20 ;
        String result;
        switch (x){
            case 1 -> result= "January";
            case 2 -> result="February";
            case 3 -> result="March";
            case 4 -> result="April";
            case 5 -> result="May";
            case 6 -> result="June";
            case 7 -> result="July";
            case 8-> result= "August";
            case 9 -> result="september";
            case 10 -> result= "October";
            case 11 -> result ="November";
            case 12 -> result = "December";
            default -> result= " No such month";

        }
        System.out.println(result);
    }
}
