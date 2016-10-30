package lesson2;

import java.util.Scanner;

/**
 * Created by panchenko_33 on 30.10.2016.
 */
public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    @Override
    public double calculateArea() {
        double halfp = a/2 + b/2 + c/2;
        double area = Math.sqrt(halfp * (halfp - a) * (halfp -b) * (halfp - c));
        return halfp;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public Shape input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first side of Triangle");
        double a = scanner.nextDouble();
        System.out.println("enter second side of Triangle");
        double b = scanner.nextDouble();
        System.out.println("enter third side of Triangle");
        double c = scanner.nextDouble();
        return null;
    }
}
