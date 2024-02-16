package day14_practice_task.Car;

import java.util.SortedMap;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable {
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Cydeo autoPArk");
    }

    @Override
    public void selfDrive() {
        System.out.println("Cydeo SelfDrive");

    }

    @Override
    public void start() {
        System.out.println("Cydeo start");

    }

    @Override
    public void drive() {

        System.out.println("Cydeo drive");
    }

    @Override
    public void fly() {
        System.out.println("Cydeo fly");

    }
}
