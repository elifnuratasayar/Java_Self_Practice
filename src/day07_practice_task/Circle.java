package day07_practice_task;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Could you write radius of circle ");
        double num1= input.nextDouble();
         double area=num1*num1*3.14;
        double perimeter=2*num1*3.14;
        input.close();
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        
    }
    
}
