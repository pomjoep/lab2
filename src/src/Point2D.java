public class Point2D {
    private int x;
    private int y;
    //private means they cannot be changed or accessed directly,
    //however within the class they can be changed
    //they also do need an object made to exist
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); // Question: Why don’t you need c.toString() here?
        // print calls the toString function of the data, which we have alr made
        System.out.println("Are b and c equal: " + b.equals(c));
    }

    public void resetToOrigin(){
        x = 0;
        y = 0;
    }
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public boolean equals(Point2D that) {
        if(this == that){
            return true;
        } else{
            return this.x == that.getX() && this.y == that.getY();
        }
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
