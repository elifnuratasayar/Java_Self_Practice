package day04_practice_tasks;

public class ChooseLanguage {
    public static final int CHOICE_1 = 1;
    public static final int CHOICE_2 = 2;
    public static final int CHOICE_3 = 3;
    public static final int CHOICE_4 = 4;
    public static final int CHOICE_5 = 5;

    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case CHOICE_1:
                System.out.println("Hello, thanbk you for your call");;
                break;
            case CHOICE_2:
                System.out.println("Hola, gracias por llamar");
                break;
            case CHOICE_3:
                System.out.println("Merhaba, aradığınız için teşekkürler");
                break;
            case CHOICE_4:
                System.out.println("Привет, спасибо за ваш звонок");
                break;
            case CHOICE_5:
                System.out.println("Merci, pour votre appel");
                break;
            default:
                System.out.println("We can not found result");
        }
    }
}