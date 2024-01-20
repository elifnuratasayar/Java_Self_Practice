package day04_practice_tasks;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ay numarasini giriniz");
        int monthNo= input.nextInt();
         switch (monthNo){
             case 12:
             case 1:
             case 2:
                 System.out.println("kis");
                 break;
             case 3:
             case 4:
             case 5:
                 System.out.println("ilkbahar");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("yaz");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("sonbahar");
                 break;
             default:
                 System.out.println("Gecersiz ay numarasi");
         }

    }
}
