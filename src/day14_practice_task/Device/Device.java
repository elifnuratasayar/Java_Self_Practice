package day14_practice_task.Device;

public abstract class Device {
    private  String brand;
    private String model;
    private double price;
    private String color;
    private String size;
    private boolean hasBattery;
   private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setColor(color);
        setSize(size);
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand== null|| brand.isEmpty()){
            throw new RuntimeException("Brand can not be empty or null");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model== null|| model.isEmpty()){
            throw new RuntimeException("Model can not be empty or null");
        }
        this.model = model;
    }

    public double getPrice() {


        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw new RuntimeException("Price  can not be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color== null|| color.isEmpty()){
            throw new RuntimeException("color can not be empty or null");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size== null|| size.isEmpty()){
            throw new RuntimeException("Size can not be empty or null");
        }
        this.size = size;
    }

   public void setHasBattery(boolean hasBattery){
        this.hasBattery=hasBattery;
   }



    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
    public abstract void turnOn();

    public abstract void turnOf() ;
}
