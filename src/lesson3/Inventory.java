package lesson3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panchenko_33 on 06.11.2016.
 */
public class Inventory {

    public static List<Product> ProductAdd() {

        List<Product> products = new ArrayList<Product>();

        products.add(new Beer("Bud ", 24, 45));
        products.add(new Beer("Dunkel ", 14, 15));
        products.add(new Beer("Weissburg ", 21, 75));
        products.add(new Beer("Carling ", 13, 28));

        products.add(new Juice("Rich ", 19, 41));
        products.add(new Juice("Sandora ", 19, 41));
        products.add(new Juice("Jaffa ", 19, 41));

        products.add(new Water("Coca-cola ", 16, 34));
        products.add(new Water("Fanta ", 16, 34));
        products.add(new Water("Sprite ", 16, 34));
        return products;
    }
}

