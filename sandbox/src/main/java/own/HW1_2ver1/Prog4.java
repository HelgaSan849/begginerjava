package own.HW1_2ver1;

public class Prog4 {
    public double x;
    public double y;
    public Prog4(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args){
        Prog4 p1 = new Prog4(6,8);
        Prog4 p2 = new Prog4(7,9);
        System.out.println("Расстояние между точками " + p1 + " и " + p2 + " = " + distance(p1, p2));
    }
    public static double distance(Prog4 p1, Prog4 p2){
        return Math.sqrt(((p2.x - p1.x)*(p2.x - p1.x))+((p2.y - p1.y)*(p2.y - p1.y)));

    }
}
