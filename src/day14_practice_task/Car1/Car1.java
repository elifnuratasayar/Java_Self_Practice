package day14_practice_task.Car1;

public abstract class Car1 {

    private final String make;
    private final String model;
    private final double year;
    private  double price;
    private String color;

    public Car1(String make, String model, double year, double price, String color) {
        this.make = make;
        if (make==null || make.isEmpty()){
            throw new RuntimeException("make can not be empty or null");
        }
        this.model = model;
        if (model== null || model.isEmpty()){
            throw new RuntimeException("make can not be empty or null");

        }
        this.year = year;
        if (year<1886){
            throw new RuntimeException("year must not less than 1886");
        }
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getYear() {
        return year;
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
        this.color = color;
    }
    public void stop(){
        System.out.println("Car is stop");
    }
    public abstract void start();
    public abstract void drive();

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
