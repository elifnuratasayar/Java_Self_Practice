package day07_practice_task;

public class AddressClients {
    public static void main(String[] args) {
        Address add1 = new Address();
        add1.buildingNumber=7925;
        add1.street="Jones Branch Dr";
        add1.city="Mclean";
        add1.state="VA";
        add1.zipCode=22012;
        add1.address();
        System.out.println(add1);
    }

}
