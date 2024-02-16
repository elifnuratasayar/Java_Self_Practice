package day14_practice_task.Car;

public abstract class Car{
    // step 1 variables
    private  String make;
    private   String model;
    private  int year;
    private  double price;
    private String color;
// step 2 Const.


    public Car(String make, String model, int year, double price, String color) {
        setMake(make);
        setModel(model);
        setYear(year);
        setPrice(price);
        setColor(color);
    }

    // step 3 getter and setter also  conditions
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw  new RuntimeException("Price can not be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color==null){
            throw new RuntimeException("Color can not be empty or null ");
        }
        this.color = color;
    }
    public  void setMake( String make){

        if ( make==null|| make.isEmpty() ){
            throw new RuntimeException("Color can not be empty or null ");
        }
        this.make=make;
    }
    public void setModel(String model){
        if ( model==null || model.isEmpty()){
            throw new RuntimeException("Color can not be empty or null ");
        }
        this.model=model;

    }

    public void setYear(int year){
        if (year<=1886){
            throw new RuntimeException("Year is invalid");
        }
        this.year= year;
    }
    // step 4 abstract  and  methods
    public abstract void start();
    public abstract void drive();
    public void stop(){
        System.out.println(getModel()+getMake()+" is stop");
    }
 // step 5 to string
    @Override
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

