package shapes;

public class Circle {

    private double radius;


    public Circle(double radius){
        this.radius = radius;
        System.out.println("Area of circle is: " + getArea());
        System.out.println("Circumference of circle is: " + getCircumference());
    }


    public double getArea(){
       return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
       return  2 * Math.PI * radius;
    }

}
