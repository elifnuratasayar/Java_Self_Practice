package day08_practice_task;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Could you write word");
        String word1= input.next();
        System.out.println("Could you write word");
        String word2= input.next();
        System.out.println(word1.substring(1)+" "+word2.substring(1));
       input.close();

    }
}
