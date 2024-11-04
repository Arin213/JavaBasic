package OOP_1.codingExercise.Point;

public class Point {
        private int x;
        private int y;

    // constructor with no args and args
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters

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
    public double distance(){
        return Math.sqrt((this.x) * (this.x) + (this.y) * (this.y));

    }
    public double distance(Point other){ //other is a parameter that represents another Point instance.
        return Math.sqrt((other.x - this.x) * (other.x - this.x) + (other.y - this.y) * (other.y - this.y));
    }

    public double distance(int x, int y){
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
}
/**    public class Point {
 private int x;
 private int y;

 public Point() {
 this(0, 0);
 }

 public Point(int x, int y) {
 this.x = x;
 this.y = y;
 }

 public int getX() {
 return this.x;
 }

 public int getY() {
 return this.y;
 }

 public void setX(int x) {
 this.x = x;
 }

 public void setY(int y) {
 this.y = y;
 }

 public double distance() {
 return distance(0, 0);
 }

 public double distance(Point point) {
 return distance(point.x, point.y);
 }

 public double distance(int x, int y) {
 return Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
 }
 }
 * */