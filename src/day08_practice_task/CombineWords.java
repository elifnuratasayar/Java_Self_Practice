package day08_practice_task;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Could you write word");
        String word1 = input.nextLine();
        System.out.println("could you write word");
        String word2 = input.nextLine();
        int length = word1.length();
        if (word1.charAt(length - 1) == word2.charAt(0)) {
            System.out.println(word1.concat(word2.substring(1)));
        }else {
            System.out.println(word1.concat(word2));}
        

    }


}