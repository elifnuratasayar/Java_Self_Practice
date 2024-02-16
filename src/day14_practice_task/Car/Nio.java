package day14_practice_task.Car;

public class Nio extends Car implements AutoPark,AutoPilot{
    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Nio autopark");
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio self drive");
    }

    @Override
    public void start() {
        System.out.println("Nio start");
    }

    @Override
    public void drive() {
        System.out.println("Nio drive ");

    }
}
