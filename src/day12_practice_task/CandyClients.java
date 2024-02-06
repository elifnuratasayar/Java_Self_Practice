package day12_practice_task;

public class CandyClients {
    public static void main(String[] args) {
        Candy candy1= new Candy();
        candy1.setBrand("Kinder");
        candy1.setHasPeanut(false);
        candy1.setPrice(15.2);
        candy1.setQuantity(12);
        System.out.println(candy1.getBrand());
        System.out.println(candy1.getPrice());
        System.out.println(candy1.getQuantity());
        System.out.println(candy1.isHasPeanut());

    }
}
