package day04_practice_tasks;

public class CrewAndPassenger {
//    public static void main(String[] args) {
//        int  x = 75;
//        if (x==100){
//            System.out.println("30 crew, 70 passenger");
//        }
//        else if (x==75){
//            System.out.println("25 crew, 50 passenger");
//        } else if (x==50) {
//            System.out.println("20 crew, 30 passenger");
//
//        }
//        System.out.println(x);

public static final int  Total50 = 50;
public static final int  Total75 =75;
public static final int Total100=100;

public static void main(String[] args) {

    int  total  = 75;
    switch (total){
        case Total50:
            System.out.println("20 crew, 30 passenger");
            break;
        case Total75:
            System.out.println("25 crew, 50 passenger");
            break;
        case Total100:
            System.out.println("30 crew, 70 passenger");
            break;

        default:
            System.out.println("ERROR");


    }
}
}


