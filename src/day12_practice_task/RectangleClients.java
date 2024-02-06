package day12_practice_task;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rect1= new Rectangle();
        rect1.setWidth(12);
        rect1.setLenght(13);
        System.out.println("width= "+rect1.getLenght());
        System.out.println("length= "+rect1.getWidth());
        System.out.println(rect1.calPerimeter());
        System.out.println(rect1.calArea());
    }
}
