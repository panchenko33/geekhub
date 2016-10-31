package lesson2;

import java.util.Scanner;

/**
 * Created by panchenko_33 on 30.10.2016.
 */
public class Rectangle implements Shape {
    private double a;
    private double b;

    @Override
    public double calculateArea() {
        double area = a * b;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = a + a + b + b;
        return perimeter;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first side of rectangle");
        double a = scanner.nextDouble();
        System.out.println("enter second side of rectangle");
        double b = scanner.nextDouble();
    }
}
