package homework;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        int num;
        int b = 0;
        int c = 0;
        int a = 0;

        Scanner scn = new Scanner(System.in);
        System.out.print("enter telephone number +380");

        if (scn.hasNextInt()) {
            num = scn.nextInt();
            int m;
            int size = 0;
            while (num != 0) {
                b = b + num % 10;
                num = num / 10;
                size++;
            }
            int[] arr = new int[size];
            for (m = 0; m < arr.length; m++) {
                b = b + num % 10;
                arr[m] = b;
                num = num / 10;
            }

            if (size != 9){
                System.out.println("you enter an incorrect telephone number");
            }

            String result = "sum";
            if (b == 1) {
                result = "one";
            } else if (b == 2) {
                result = "two";
            } else if (b == 3) {
                result = "three";
            } else if (b == 4) {
                result = "four";
            } else if ( 10 > b && b > 4 ) {
                result = " "+ b;
            } else if (b >= 10) {
                System.out.println("sum1 = " + b);
                while (b != 0) {
                    a = a + b % 10;
                    b = b / 10;
                }
                result = " "+ a;
            } else if (a >= 10) {
                while (a != 0) {
                    c = c + a % 10;
                    a = a / 10;
                }
                result = " "+ c;
            }
            System.out.println("sum = " + result);

        } else System.out.println ("it`s not a telephone number");
    }
}