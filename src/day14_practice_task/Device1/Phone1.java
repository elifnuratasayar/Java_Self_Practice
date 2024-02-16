package day14_practice_task.Device1;

public abstract class Phone1  extends Device1{
    public Phone1(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public  void call(long number) {
        System.out.println(number+" is calling");
    }

    public  void text(long number){
        System.out.println(number+" is texting ");

    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+getModel()+"is turn On");

    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+ getModel()+" is turnnOff");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
