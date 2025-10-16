package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {


        String text = Console.readLine();
        System.out.println(text);
        List<String> splittedString = splitText(text);
        int sum = addNums(splittedString);
        System.out.println("결과: " + sum);


    }

    private static List<String> splitText(String text) {


        Matcher matcher = Pattern.compile("//(.)\\\\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            String numbersText = matcher.group(2);
            return Arrays.asList(numbersText.split(Pattern.quote(customDelimiter)));
        }
        return Arrays.asList(text.split("[,:]"));

    }

    private static int addNums(List<String> list ) {

        int sum = 0;


        for ( String numStr: list) {
            try {
                int number = Integer.valueOf(numStr);


                if (number < 0) {
                    throw new IllegalArgumentException("음수는 허용되지 않습니다: " + number);
                }
                sum += number;

            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("입력값에 숫자가 아닌 문자가 포함되어 있습니다: " + numStr, e);
            }
        }

        return sum;
    }
}
