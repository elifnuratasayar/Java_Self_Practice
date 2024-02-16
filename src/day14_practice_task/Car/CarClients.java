package day14_practice_task.Car;

import day14_practice_task.Car1.Car1;

public class CarClients {
    public static void main(String[] args) {
        Audi audi= new Audi("Audi","class",1889,120_000,"Black");
        System.out.println(audi);
        audi.autoPark();
        audi.start();
        System.out.println("---------");
        Toyota toyota=new Toyota("Toyota","auirs",2017,35_000,"white");
        System.out.println(toyota);
        toyota.drive();
        toyota.start();

        System.out.println("-----------");
        CydeoCar cydeoCar= new CydeoCar("aaaa","bbb",2019,120_000,"Purple");
     cydeoCar.autoPark();
     cydeoCar.fly();



    }

}
