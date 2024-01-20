package day08_practice_task;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your email");
        String str1=input.nextLine();
        int index1=str1.indexOf("_");
        int index2=str1.indexOf("@");
        int index3=str1.indexOf(".");
        String firstName=str1.substring(0,index1);
        String secondName=str1.substring(index1+1,index2);
        String domain=str1.substring(index2+1,index3);
        System.out.println("firstName = " + firstName);
        System.out.println("secondName = " + secondName);
        System.out.println("domain = " + domain);
    }
}
