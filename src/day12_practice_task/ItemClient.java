package day12_practice_task;

public class ItemClient {
    public static void main(String[] args) {
        Item item1= new Item();
        item1.setName("");
        item1.setUnitPrice(12);
        item1.setQuantity(3);
        System.out.println(item1.getName());
        System.out.println(item1.getUnitPrice());
        System.out.println(item1.getQuantity());
        System.out.println(item1.calCost());

    }
}
