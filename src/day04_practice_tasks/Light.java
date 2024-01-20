package day04_practice_tasks;

public class Light {
    public static void main(String[] args) {

        String lightColor = "y";
        switch (lightColor){
            case "R":
            case"r":
                System.out.println("Red");
                break;
            case"Y":
            case"y":
                System.out.println("yellow");
                break;
            case "G":
            case"g":
                System.out.println("green");
                break;
            default:
                System.out.println("invalid Color");
                break;
        }
    }


}
