package day12_practice_task;

public class Rectangle {

    // step1
    private double width;
    private double lenght;
    // step 2

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width == 0 || width < 0) {
            System.err.println("The widht cannot be set to negative or zero values");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLenght() {

        return lenght;
    }

    public void setLenght(double lenght) {
        if (lenght == 0 || lenght < 0) {
            System.err.println("The lenght cannot be set to negative or zero values");
            System.exit(1);
        }
        this.lenght = lenght;
    }

    public double calArea() {
        double area = lenght * width;
        return area;
    }

    public double calPerimeter() {
        double parea = 2 * (lenght + width);
        return parea;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}

    /*
     Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.*/

