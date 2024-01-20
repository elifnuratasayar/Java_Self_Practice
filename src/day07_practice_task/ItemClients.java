package day07_practice_task;

public class ItemClients {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "Crackers";
        item1.quantity= 14;
        item1.unitPrice=50.0;
        item1.calcCost();
        System.out.println(item1);
    }

}
