package day14_practice_task.CarShop;

import day14_practice_task.Car.Teslaaaa;

import java.util.ArrayList;
import java.util.Arrays;

public class Cars {
    public static void main(String[] args) {
         CarShop[] cars= {
                 new Honda("Pilot", "White", 2010, 25000),
                 new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
    };

        for (CarShop carinfo : cars) {
            if ((carinfo instanceof Honda && (carinfo.getYear()>=2010 || carinfo.getYear()==2011))||
            (carinfo instanceof Audi&&( carinfo.getYear()>= 2015 || carinfo.getYear()<=2019 ) ) ||
                    (carinfo instanceof Tesla && (carinfo.getYear()>=2015 || carinfo.getYear()<=2016 ))) {
                System.out.println(carinfo);
            }else {
                System.out.println("invalid year");
            }
            }
        CarShop highestPrice=cars[0];//200
        CarShop lowestPrice=cars[0];
        for (CarShop carprice : cars) {
            if (carprice.getPrice() >highestPrice.getPrice()){
             highestPrice=carprice;

            } else if (carprice.getPrice()<lowestPrice.getPrice()) {
                lowestPrice=carprice;

            }
        }
            System.out.println("lowestPrice = " + lowestPrice);
            System.out.println("highestPrice = " + highestPrice);


        ArrayList<Tesla>teslaCar= new ArrayList<>();
        for (CarShop carname : cars) {
            if (carname instanceof Tesla){
                teslaCar.add((Tesla)carname);

            }

        }
        for (Tesla tesla : teslaCar) {
            System.out.println(tesla.getModel());
        }



    }


}

