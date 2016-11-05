package lesson3;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by panchenko_33 on 05.11.2016.
 */
public class Inventory {
    public static void main(String args[]) {

        int quantity = 0;
        int sum = 0;
        String name = "";

        List<Product> product = new ArrayList<Product>();

        product.add(new Beer("Bud ", 24, 45));
        product.add(new Beer("Dunkel ", 14, 15));
        product.add(new Beer("Weissburg ", 21, 75));
        product.add(new Beer("Carling ", 13, 28));

        product.add(new Juice("Rich ", 19, 41));
        product.add(new Juice("Sandora ", 19, 41));
        product.add(new Juice("Jaffa ", 19, 41));

        product.add(new Water("Coca-cola ", 16, 34));
        product.add(new Water("Fanta ", 16, 34));
        product.add(new Water("Sprite ", 16, 34));

        for (int i = 0; i < product.size(); i++) {
            quantity = quantity + product.get(i).quantity;
            sum = sum + product.get(i).price * product.get(i).quantity;
            name = name + product.get(i).name;
        }
        System.out.println("We have products of such companies as " + name );
        System.out.println("The quantity of products is  " + quantity);
        System.out.println("The total price of products is " + sum + " hrn");
    }
}
