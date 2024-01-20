package day01_pratice_tasks;

public class Calculates {
    public static void main(String[] args) {

                int math =  60;
                int chemistry = 50;
                int biology = 70;
                double average= (math+chemistry+biology)/3;
                if (average >=90 ) {
                    System.out.println("Score is A"); }
                else if (average >= 80) {
                    System.out.println("Score is B");}

                if(average>= 70){
                    System.out.println("Score is C");
                }

                if (average>=60){
                    System.out.println("Score is D");
                }
        if (average <= 59) {
            System.out.println("Score is F");
        }
        }



}
