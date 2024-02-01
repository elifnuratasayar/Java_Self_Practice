package day05_practice_task;

public class SelfTask {

    public static void main(String[] args) {
        int toplam=0;
        for (int i = 1; i <3 ; i++) {
            toplam +=i;

        }
        System.out.println(toplam);
  int first=20;
  int last = 61;
        for (int j = first; j < last; j+=3) {
            System.out.println(j);
        }
        int input=100;
        for (int z = input; z >=1 ; z--) {
            if (z%3==0){
                System.out.println(z);
            }

        }
    }
}
