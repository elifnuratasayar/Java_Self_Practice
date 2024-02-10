package day13_parctice_task.phone;

public class Phone {
   private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty()|| brand==null || brand.equals("")){
            System.err.println("brand must not be null, empty, or blank.");
            System.exit(1);

        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty()|| model==null || model.equals("")){
            System.err.println("model must not be null, empty, or blank.");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.isEmpty()|| size==null || size.equals("")){
            System.err.println("size must not be null, empty, or blank.");
            System.exit(1);
        }
        this.size = size;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Price must greather than zero ");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()|| color==null || color.equals(""))
        System.err.println("color must not be null, empty, or blank.");


        this.color = color;
    }

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public  void call(int phoneNumber){
        System.out.println("calling the number"+phoneNumber);

    }
    public void text(int phoneNumber){
        System.out.println("texting to the number"+phoneNumber);
    }
    public void faceTime(int phoneNumber){
        System.out.println("facetiming with the number"+phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}
/*
. Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.
 */