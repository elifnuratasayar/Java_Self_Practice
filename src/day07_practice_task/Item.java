package day07_practice_task;

public class Item {
    String name;
    double unitPrice;
    int quantity;
    public void calcCost(){
       double cost=quantity*unitPrice;
        System.out.println("the cost is " +cost);
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}

