package homework;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("enter telephone number +380");

        if (scn.hasNextInt()) {

            int num = scn.nextInt();
            int size = 0;
            int i = 0;

            while (num != 0) {
                i = i + num % 10;
                num = num / 10;
                size++;
            }

            if (size == 9) {

                String result = "sum";
                if (i == 1) {
                    result = "one";
                } else if (i == 2) {
                    result = "two";
                } else if (i == 3) {
                    result = "three";
                } else if (i == 4) {
                    result = "four";
                } else if (10 > i && i > 4) {
                    result = " " + i;
                } else if (i >= 10) {
                    System.out.println("sum1 = " + i);
                    while (i != 0) {
                        num = num + i % 10;
                        i = i / 10;
                    }
                    result = " " + num;
                }
                if (num >= 10) {

                    System.out.println("sum2 = " + num);

                    while (num != 0) {
                        i = i + num % 10;
                        num = num / 10;
                    }

                    result = " " + i;
                }

                System.out.println("sum = " + result);

            } else System.out.println("you enter an incorrect telephone number");

        } else System.out.println ("it`s not a telephone number");
    }
}
