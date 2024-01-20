package day04_practice_tasks;


public class LaptopModel {
    public static final int APPLE = 1;
    public static final int DELL =2;
    public static final int HP = 3;

    public static void main(String[] args) {
        int  choice = 1;
        switch (choice){
            case APPLE:
                System.out.println("Apple-no virus");
                break;
            case DELL:
                System.out.println("Tough one");
                break;
            case HP:
                System.out.println("Not Recommended");
                break;

            default:
                System.out.println("do not buy that one");


        }
    }
}

