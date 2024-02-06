package day12_practice_task;

public class Circle {
    // step 1
    private int radius;
    // step 2
    public double calcAre(){
        double area= Math.PI* Math.pow(radius,2);
        return area;
    }



     public double calcPerimeter(){
        double perimeter=2*Math.PI*radius;
          return perimeter;
     }



    public int getRadius() {
        return radius;

    }

    public void setRadius(int radius) {
        if (radius==0|| radius<0){
            System.err.println("The radius cannot  be set a negative or zero value");
            System.exit(1);
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    /*Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.
*/
}
