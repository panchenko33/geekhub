package Lesson5HW1;


import Lesson5HW1.Source.SourceLoader;
import Lesson5HW1.Source.URLSourceProvider;

import java.io.IOException;
import java.util.Scanner;

public class TranslatorController {

    public static void main(String[] args) throws IOException {

        SourceLoader sourceLoader = new SourceLoader();
        Translator translator = new Translator(new URLSourceProvider());

        Scanner scanner = new Scanner(System.in);
        String ex = scanner.next();
        while(!"exit".equals(ex)) {
            try{
                String source = sourceLoader.loadSource(ex);
                String translation = translator.translate(source);
                System.out.println("Original: " + source);
                System.out.println("Translation: " + translation);

            } catch (TranslateException e) {
                System.out.println("Problems with translation");
            }
            ex = scanner.next();
        }
    }
}
