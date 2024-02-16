package day14_practice_task.Device1;

public abstract class Device1 {
    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final double size;
    boolean hasBattery= true;
    boolean hasPowerButton=true;

    public Device1(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        if (brand==null|| brand.isEmpty()){
            throw  new RuntimeException("brand can not be null or empty");
        }
        this.model = model; if (model==null|| model.isEmpty()){
        throw  new RuntimeException("model can not be null or empty");
    }

        this.price = price;
        this.color = color;
        this.size = size;
        if ( size<0){
            throw  new RuntimeException("size  can not less zero ");
        }
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null|| color.isEmpty()){
            throw  new RuntimeException("color can not be null or empty");
        }
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn() ;



    public abstract void turnOff() ;



    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
