package day07_practice_task;

public class Rectangle {
    double width;
    double length;

    public void calculateArea(){
        double area= width*length;
        System.out.println("Rectangle area is "+area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public void calculatePerimeters(){
        double perimeters= 2 *(width+length);
        System.out.println("Rectangle perimeters "+perimeters);

    }
}
