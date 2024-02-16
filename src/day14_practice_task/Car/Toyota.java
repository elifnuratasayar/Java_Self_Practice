package day14_practice_task.Car;

public class Toyota extends Car{

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota start");
    }

    @Override
    public void drive() {
        System.out.println("Toyota drive");

    }
}
