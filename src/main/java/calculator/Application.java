package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        String text = Console.readLine();

        List<String> splittedString = splitText(text);

        int sum = addNums(splittedString);

        System.out.println(sum);



    }

    private static List<String> splitText(String text) {

        return Arrays.asList(text.split("[,:]"));

    }

    private static int addNums(List<String> list ) {

        int sum = 0;

        for ( String num: list) {

            int temp = Integer.valueOf(num);
            sum += temp;
        }

        return sum;
    }
}
