package day07_practice_task;

public class Address {
    int buildingNumber;
    String street, city, state;
    int zipCode;
    public void address(){
        System.out.println(buildingNumber+" "+street+" "+city+" "+state+" "+zipCode);
    }

    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
