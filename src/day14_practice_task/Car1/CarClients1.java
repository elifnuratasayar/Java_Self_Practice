package day14_practice_task.Car1;

public class CarClients1 {
    public static void main(String[] args) {
        Audi1 audi1p= new Audi1("Audi","Cla",1995,19_000,"black");
        System.out.println(audi1p);
        audi1p.drive();
        audi1p.start();
        audi1p.autoPark();
        Bmw1 bmw1p= new Bmw1("Bmw","S200",2000,20_000,"pink");
        System.out.println(bmw1p);
        bmw1p.drive();
        bmw1p.start();
        Honda1 honda1p= new Honda1("Honda","e200",2020,2030,"white");
        System.out.println(honda1p);
        honda1p.drive();
        honda1p.start();
        CydeoCar1 cydeoCar1= new CydeoCar1("Cydeo","Qa",1995,25_000,"purple");
        System.out.println(cydeoCar1);
        cydeoCar1.fly();
        cydeoCar1.selfDrive();
        cydeoCar1.drive();


    }
}
