package day04_practice_tasks;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 10,
            n2= 0;
        char operator = '/';
        switch (operator) {
            case '+' :
                System.out.println("Addition:"+(n1+n2));
                break;

            case '-':
                System.out.println("Subtraction:"+(n1-n2));
                break;
            case '/':
                System.out.println("Division:"+(n1/n2));
                if (n2==0){
                    System.out.println("Can not by divide a number by zero");
                    break;
                }
                break;
            case '*':
                System.out.println("Multiplication:"+(n1*n2));
                break;
            default:
                System.out.println("invalid Operator");
   }

    }
}
