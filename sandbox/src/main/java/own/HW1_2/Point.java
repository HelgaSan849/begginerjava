package own.HW1_2;

public class Point {
    public double x;
    public double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args){
        Point p1 = new Point(6,8);
        Point p2 = new Point(7,9);
        System.out.println("Расстояние между точками " + p1 + " и " + p2 + " = " + distance(p1, p2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(((p2.x - p1.x)*(p2.x - p1.x))+((p2.y - p1.y)*(p2.y - p1.y)));

    }
}
