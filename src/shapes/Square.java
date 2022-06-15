package shapes;

public class Square extends Rectangle{

    public Square(int side){
        super(side, side);
    }

    public int getArea(){
        System.out.println("square area");
        return 4 * length;
    }

    public int getPerimeter(){
        System.out.println("square perimeter");
        return (int) Math.pow(length, 2);
    }

}
