package calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        String[] splittedString = splitText(text);

    }

    private static String[] splitText(String text) {

        return text.split("[,:]");

    }
}
