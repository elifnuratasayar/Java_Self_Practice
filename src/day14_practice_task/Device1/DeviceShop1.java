package day14_practice_task.Device1;

public class DeviceShop1 {
    public static void main(String[] args) {

        Laptop1 laptop1 = new Laptop1("Apple", "m2", 1200, "Grey", 123, true, true);
        laptop1.turnOff();
        laptop1.turnOn();
        System.out.println(laptop1);
        System.out.println("=======");
        Samsung1 samsung1= new Samsung1("Samsung","kl3029",800,"white",345,true,false);
        samsung1.turnOff();
        samsung1.turnOn();
        samsung1.call(234534);
        samsung1.text(939499);
        System.out.println(samsung1);
        samsung1.downloadApp();
        System.out.println("++++++++++");
        Iphone1 iphone1= new Iphone1("iphone","max",1200,"silver",123,true,true);
        iphone1.downloadApp();
        iphone1.appleStoreName();
        System.out.println(iphone1);
        System.out.println("++++++++++");

        Computer1 computer1= new Computer1("Sonyy","s230",1200,"grey",123,false,false);
        computer1.print();
        computer1.turnOff();
        computer1.turnOn();
        System.out.println(computer1);
    }

}