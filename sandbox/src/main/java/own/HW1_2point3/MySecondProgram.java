package own.HW1_2point3;

public class MySecondProgram {
    public static void main(String[] args){
        Point p1 = new Point(6,8);
        Point p2 = new Point(7,9);
        System.out.println("Расстояние между точками " + p1 + " и " + p2 + " = " + p1.distance(p2));
    }

}
