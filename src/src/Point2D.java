public class Point2D {
    private int x;
    private int y;
    //private means they cannot be changed or accessed directly,
    //however within the class they can be changed
    //they also do need an object made to exist

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
