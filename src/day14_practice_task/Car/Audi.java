package day14_practice_task.Car;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }



    @Override
    public void start() {
        System.out.println("Audi start");

    }

    @Override
    public void drive() {
        System.out.println("Audi driving");

    }

    @Override
    public void autoPark() {
        System.out.println("Audi parking");

    }
}
