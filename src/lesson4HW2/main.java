package lesson4HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many words you will enter");

        int n = scanner.nextInt();

        List<String> input = new ArrayList<>();

        System.out.println("Please enter words");

        for (int i = 0; i < n; ++i) {
            input.add(scanner.next());
        }

        List<String> result = new ArrayList<>();
        for (String s : input) {
            if (s.length() > 10) {
                String abbreviation = getAbbreviation(s);
                result.add(abbreviation);
            } else {
                result.add(s);
            }
        }

        System.out.println(result);
    }

    private static String getAbbreviation(String s) {
        int length = s.length() - 2;
        String result = s.charAt(0) + String.valueOf(length) + s.charAt(s.length() - 1);
        return result;
    }
}


