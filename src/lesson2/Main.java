package lesson2;

import java.util.Scanner;

import static lesson2.Figure.*;

/**
 * Created by panchenko_33 on 30.10.2016.
 */
public class Main {

    public static void main(String args[]){

        Shape resultShape;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter figure : Circle, Triangle, Square or Rectangle");
        String figure = scanner.nextLine();

        switch (figure) {
            case "Circle":
                resultShape = new Circle();
                break;
            case "Triangle":
                resultShape = new Triangle();
                break;
            case "Square":
                resultShape = new Square();
                break;
            case "Rectangle":
                resultShape = new Rectangle();
                break;
            default:
                resultShape = new Circle();
        }

        resultShape.input();

        System.out.println("area = " + resultShape.calculateArea() +
                " perimeter = " + resultShape.calculatePerimeter() );
    }
}
