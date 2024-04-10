public class Square {
    int x = 0;
    int y = 0;
    double side = 0;
    String shape = "[]";

    public Square(){};
    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Square(int x, int y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
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
    public double getSideLength() {
        return side;
    }
    public void setSideLength(double side) {
        this.side = side;
    }
    public double getArea(){
        return (side *= side);
    }

}
