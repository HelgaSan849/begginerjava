package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		Square s = new Square(5);
		s.l = 5;
		System.out.println("Площадь квадрата со стороной" + s.l + " = " + area(s));
		double a = 4;
		double b = 6;
	}
	public static double area(Square s) {
		return s.l * s.l;
	}
	public static double area(double a, double b) {
		return a * b;
	}
}
