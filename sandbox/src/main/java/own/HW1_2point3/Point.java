package own.HW1_2point3;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point pCalc) {
        return Math.sqrt(((this.x - pCalc.x) * (this.x - pCalc.x)) + ((this.y - pCalc.y) * (this.y - pCalc.y)));

    }
}