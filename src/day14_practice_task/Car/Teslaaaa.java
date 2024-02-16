package day14_practice_task.Car;

public class Teslaaaa extends Car implements AutoPark,AutoPilot{
    public Teslaaaa(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("tesla autopark");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla selfdrive");
    }

    @Override
    public void start() {
        System.out.println("tesla start");

    }

    @Override
    public void drive() {
        System.out.println("tesla drive");

    }
}
