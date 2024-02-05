package day11_practice_task;

import java.util.Scanner;

public class Pizzaa {
        public String size;
        public int numberOfCheeseTopping;
        public int numberOfPepperoniTopping;
        public  int calCost(){
            int totalCost;

            if (size.equalsIgnoreCase("small")){
                totalCost= 10+((2*numberOfCheeseTopping)+(2*numberOfPepperoniTopping));
                System.out.println("your order is: "+totalCost);
                return totalCost;
            }else if (size.equalsIgnoreCase("medium")){
                totalCost=12+((2*numberOfCheeseTopping)+(2*numberOfPepperoniTopping));
                System.out.println("your order is: "+totalCost);
                return totalCost;
            }else if (size.equalsIgnoreCase("large")){
                totalCost=14+((2*numberOfCheeseTopping)+(2*numberOfPepperoniTopping));
                return totalCost;
            }
           return 0;
        }

    @Override
    public String toString() {
        return "Pizzaa{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +"\nTotal cost= $"+calCost();
    }
}
/*1. Create a custom class named Pizza with the following specifications:
    Attributes:
		   size
		   numberOfCheeseTopping
	   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
  		Small: $10 + $2 per topping
  		Medium: $12 + $2 per topping
  		Large: $14 + $2 per topping

   Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object*/
