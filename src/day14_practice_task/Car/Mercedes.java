package day14_practice_task.Car;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes autoparking");
    }

    @Override
    public void start() {
        System.out.println("Mercedes start");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes Drive");

    }
}
