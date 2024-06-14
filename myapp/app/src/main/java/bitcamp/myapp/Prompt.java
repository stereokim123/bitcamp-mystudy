package bitcamp.myapp;

import java.util.Scanner;

public class Prompt {
    static Scanner keyboardScanner = new Scanner(System.in);

    public static String prompt(String title) {
        System.out.printf("%s", title);
        return keyboardScanner.nextLine();
    }

    static void close() {
        keyboardScanner.close();
    }

}
