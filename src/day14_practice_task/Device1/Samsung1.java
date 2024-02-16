package day14_practice_task.Device1;

public class Samsung1 extends Phone1 implements AndroidApps1,Downloadable1 {

    public Samsung1(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String appStoreName() {
        return null;
    }

    @Override
    public String oS() {
        return null;
    }

    @Override
    public void downloadApp() {

    }

    @Override
    public void call(long number) {
        super.call(number);
    }

    @Override
    public void text(long number) {
        super.text(number);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
