package lesson3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by panchenko_33 on 05.11.2016.
 */
public class Inventory {
    public static void main(String args[]) {

        int quantity = 0;
        int sum = 0;
        String name = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("please choice what you need : 1 - info about all products;" +
                "2 - Beer; 3 - Water; 4 - Juice; ");
        int enteredValue = scanner.nextInt();

        switch (enteredValue) {
            case 1:
                resultShape = new Circle();
                break;
            case 2:
                resultShape = new Triangle();
                break;
            case 3:
                resultShape = new Square();
                break;
            case 4:
                resultShape = new Rectangle();
                break;
            default:
                resultShape = new Circle();
        }

        resultShape.input();

        List<Product> brand = new ArrayList<Product>();

        brand.add(new Beer("Bud ", 24, 45));
        brand.add(new Beer("Dunkel ", 14, 15));
        brand.add(new Beer("Weissburg ", 21, 75));
        brand.add(new Beer("Carling ", 13, 28));

        for (int i = 0; i < brand.size(); i++) {
            quantity = quantity + brand.get(i).quantity;
            sum = sum + brand.get(i).price;
            name = name + brand.get(i).name;
        }
        System.out.println("We have products of such companies as " + name );
        System.out.println("The quantity of products is " + quantity);
        System.out.println("The total price of products is " + sum + " hrn");
    }
}
