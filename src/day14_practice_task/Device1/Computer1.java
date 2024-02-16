package day14_practice_task.Device1;

public class Computer1 extends Device1 {
    public Computer1(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void print(){
        System.out.println(getBrand()+getModel()+" is printing");
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+getModel()+"is turn onn");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+getModel()+"is off ");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
