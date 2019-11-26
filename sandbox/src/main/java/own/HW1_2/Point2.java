package own.HW1_2;

public class Point2 {
    public double x;
    public double y;


    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(((Point3.x2 - this.x)*(Point3.x2 - this.x))+((Point3.y2 - this.y)*(Point3.y2 - this.y)));

    }
}
