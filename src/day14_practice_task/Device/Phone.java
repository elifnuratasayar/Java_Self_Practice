package day14_practice_task.Device;

public abstract class Phone extends Device{


    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }


    public  void call(long phoneNumber){
        System.out.println(phoneNumber+" is calling");
    }

    public  void text(long phoneNumber){
        System.out.println(phoneNumber+" is texting ");
    }

    @Override
    public void turnOn() {
        System.out.println(getModel()+ "is turning on ");

    }

    @Override
    public void turnOf() {
        System.out.println(getModel()+" is turning off");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
