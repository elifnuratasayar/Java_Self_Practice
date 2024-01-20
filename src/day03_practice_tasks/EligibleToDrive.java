package day03_practice_tasks;

public class EligibleToDrive {
    public static void main(String[] args) {

        double age = 13.0;
        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;
        boolean result=  (age >= 18 && hasDriverLicense) || ( age >= 15.5 && hasLearningPermit);
        System.out.println("Is Mike eligible to drive " + result);

    }
}
