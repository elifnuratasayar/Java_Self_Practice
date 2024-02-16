package day14_practice_task.Car;

public class Bmw extends Car{
    public Bmw(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Bmw start");

    }

    @Override
    public void drive() {
        System.out.println("Bmw drving");

    }
}
