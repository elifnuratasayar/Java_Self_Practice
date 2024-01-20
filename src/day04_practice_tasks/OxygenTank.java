package day04_practice_tasks;

public class OxygenTank {
    public static void main(String[] args) {

        int num = 75;
        String result = (num > 90) ? "Your thank is full" : (num >80 ) ? "Still okay" : (num >70) ?"Dont go too far" : (num>60)? "Start to head back" :(num>50)? "Be careful you are at %50": "error";
        System.out.println(result);
    }
}