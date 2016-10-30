package lesson2;

import java.util.Scanner;

import static lesson2.Figure.*;

/**
 * Created by panchenko_33 on 30.10.2016.
 */
public class Main {

    public static void main(String args[]){

        Shape resultShape = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter figure: CIRCLE, TRIANGLE, SQUARE or RECTANGLE");
        Figure figure = Figure.valueOf(scanner.nextLine());

        switch (figure) {
            case CIRCLE:
                resultShape = new Circle();
                break;
            case TRIANGLE:
                resultShape = new Triangle();
                break;
            case SQUARE:
                resultShape = new Square();
                break;
            case RECTANGLE:
                resultShape = new Rectangle();
                break;
        }

        resultShape = resultShape.input();

        double area = resultShape.calculateArea();
        double perimeter = resultShape.calculatePerimeter();

        System.out.println("area = " + area + "perimeter = " + perimeter);
    }
}
