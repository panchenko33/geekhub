package lesson3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by panchenko_33 on 05.11.2016.
 */
public class Main {
    public static void main(String args[]) {

        int quantity = 0;
        int sum = 0;
        String name = "";

        List<Product> products = Inventory.ProductAdd();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what you need : 1 - all products;" +
                "2 - beer; 3 - juice; 4 - water");

        int enteredValue = scanner.nextInt();

        List<Product> necessaryProducts = new ArrayList<>();

        for (Product p : products) {
            switch (enteredValue) {
                case 1:
                    necessaryProducts.add(p);
                    break;
                case 2:
                    if (p instanceof Beer) {
                        necessaryProducts.add(p);
                    }
                    break;
                case 3:
                    if (p instanceof Juice) {
                        necessaryProducts.add(p);
                    }
                    break;
                case 4:
                    if (p instanceof Water) {
                        necessaryProducts.add(p);
                    }
                default:
                    necessaryProducts.add(p);
            }
        }

        for (Product p : necessaryProducts) {
            quantity = quantity + p.quantity;
            sum = sum + p.price * p.quantity;
            name = name + p.name;
        }

        System.out.println("We have products of such companies as " + name );
        System.out.println("The quantity of products is  " + quantity);
        System.out.println("The total price of products is " + sum + " hrn");

    }

}
