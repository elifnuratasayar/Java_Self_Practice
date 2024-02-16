package day14_practice_task.Device;

public abstract class Computer extends Device {

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
    public void print(){
        System.out.println(getModel()+"is printing");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
