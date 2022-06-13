package shapes;

public class Circle {

    private double radius;


    public Circle(double radius){
        setRadius(radius);
        System.out.println("Area of circle is: " + getArea());
        System.out.println("Circumference of circle is: " + getCircumference());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
       double area = Math.PI * (radius * radius);
        return area;
    }

    public double getCircumference(){
       double circumference = 2 * Math.PI * radius;
       return circumference;
    }

}
