package day08_practice_task;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your email ");
        String str=input.nextLine();
        if (str.contains("_")){
            int index=str.indexOf("_");
            String firstName= str.substring(0,index);
            int index2= str.indexOf("@");
            String secondName=str.substring(index+1,index2);
            String result=str.substring(index2);
            System.out.println(secondName+"_"+firstName+result);
        }else {
            System.out.println(str);
        }
    }
}
