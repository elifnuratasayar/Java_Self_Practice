package day10_practice_task;

import java.io.FilterOutputStream;
import java.util.Locale;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str= "JAVA java";
        int upperCase=0;
        int lowerCase=0;
        boolean result= lowerCase==upperCase;

        for (char ch: str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
        }
            System.out.println( result);
        }
    }

