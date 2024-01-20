package day07_practice_task;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner info= new Scanner(System.in);
        System.out.println("enter your age ");
        int age= info.nextInt();
        System.out.println("enter your gender");
        String gender= info.next();
        System.out.println("enter your full name");
        String name= info.next();
        System.out.println("Could you write zipcode");
        double zipCode= info.nextDouble();
        System.out.println("Could you write schoolname");
        String school=info.next();
        System.out.println("could you write city name ");
        String citty=info.next();
        System.out.println("Could you write state");
        info.close();
        System.out.println(age+gender+name+zipCode+school+citty);

    }
}
