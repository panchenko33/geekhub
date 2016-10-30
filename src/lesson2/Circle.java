package lesson2;

import java.util.Scanner;

/**
 * Created by panchenko_33 on 30.10.2016.
 */
public class Circle implements Shape {
    private double r;

    @Override
    public void calculateArea() {
        double area = Math.PI * (r * r);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = Math.PI * 2 * r;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius of circle");
        double r = scanner.nextDouble();
    }
}
