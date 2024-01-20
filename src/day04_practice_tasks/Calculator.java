package day04_practice_tasks;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 10,
            n2= 20;
        char operator = '+';
        switch (operator) {
            case '+' :
                System.out.println("Addition:"+(n1+n2));

            case '-':
                System.out.println("Subtraction:"+(n1-n2));
            case '/':
                System.out.println("Division:"+(n1/n2));
            case '*':
                System.out.println("Multiplication:"+(n1*n2));
            default:
                System.out.println("invalid Operator");}
        System.out.println(operator);
    }
}
