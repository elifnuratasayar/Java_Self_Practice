package day12_practice_task;

public class Item {

    private  String name;
    private double unitPrice;
    private  double quantity;

    // step 2 getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if((name.contains("")) || !name.matches("^@%*$") && (name.startsWith("A-Z"))){
            System.err.println("The name  cannot be  this type");
            System.exit(1);

        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice==0 || unitPrice<0){
            System.err.println("The unitPrice cannot be negative and zero.");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity==0 || quantity<0){
            System.err.println("The quantity cannot be negative and zero ");
            System.exit(1);
        }
        this.quantity = quantity;
    }
    public  double  calCost(){
        double cost= (quantity*unitPrice);
        return cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
/*Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
     */

