package lesson2;

import java.util.Scanner;

/**
 * Created by panchenko_33 on 30.10.2016.
 */
public class Square implements Shape {
    private double a;

    @Override
    public double calculateArea() {
        double area = a * a;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = a * 4;
        return perimeter;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first side of rectangle");
        double a = scanner.nextDouble();
    }
}
