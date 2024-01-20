package day08_practice_task;

import java.util.Scanner;

public class StartsWithX{

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Could you write a word");
        String word= input.next();

        word=word.replaceFirst("x","a");
        input.close();
        System.out.println(word);
        input.close();
    }
    }

