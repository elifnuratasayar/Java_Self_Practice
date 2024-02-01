package day04_practice_tasks;

public class Browser {
    public static void main(String[] args) {
        String browser="chrome";
        switch (browser.toLowerCase()){
            case "chrome"-> System.out.println("Open the chrome browser");
            case "firefox"-> System.out.println("Open the firefox browser");
            case"safari"-> System.out.println("Open the safari browser");
            case "edge"-> System.out.println("Open the edge browser");
            case"opera"-> System.out.println("Open the opera browser");
            default -> System.out.println("Invalid browser is selected");
        }
    }
}
