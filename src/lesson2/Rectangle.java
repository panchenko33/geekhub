package lesson2;

import java.util.Scanner;

/**
 * Created by panchenko_33 on 30.10.2016.
 */
public class Rectangle implements Shape {
    private double a;
    private double b;

    @Override
    public void calculateArea() {
        double area = a * b;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = a + a + b + b;
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
