package homework;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        int i, a = 0, b = 0, c = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("enter telephone number +380");

        if (scn.hasNextInt()) {
            i = scn.nextInt();

            if (i > 999999999)System.out.println("number is too long");

            while (i != 0) {
                b = b + i % 10;
                i = i / 10;
            }
            if (b == 1) System.out.println("sum = one");
            if (b == 2) System.out.println("sum = two");
            if (b == 3) System.out.println("sum = three");
            if (b == 4) System.out.println("sum = four");
            if ( 10 > b && b > 4 ) System.out.println("sum1 = " + b);

            if (b >= 10) {
                System.out.println("sum1 = " + b);
                while (b != 0) {
                    a = a + b % 10;
                    b = b / 10;
                }
                System.out.println("sum2 = " + a);
            }


                if (a >= 10) {
                    while (a != 0) {
                        c = c + a % 10;
                        a = a / 10;
                    }
                    System.out.println("sum3 = " + c);
                }





        } else System.out.println ("it`s not a telephone number");
    }
}
