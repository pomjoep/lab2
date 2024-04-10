import java.awt.Color;
public class Circle {
    int x = 0;
    int y = 0;
    double radius = 0;
    String shape = "O";
    Color color = Color.cyan;

    public Circle(){};
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        System.out.println(shape);
    }

    @Override
    public String toString(){
        return shape;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double side) {
        this.radius = side;
    }
    public double getArea(){
        return (Math.PI  * (radius * radius));
    }
}