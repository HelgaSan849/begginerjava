package own.HW1_2;

public class Point {

    public static void main(String[] args){
        Point2 p1 = new Point2(6,8);
        Point3 p2 = new Point3(7,9);
        System.out.println("Расстояние между точками " + p1 + " и " + p2 + " = " + Point2.distance());
    }
}
