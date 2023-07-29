package StepH;

import java.util.Scanner;

public class H07 {

    public static void main(String[] args) {
        H07 stepH = new H07();
        stepH.h07();
    }

    Scanner sc = new Scanner(System.in);

    void h07() {
        H07Sub h07sub = new H07Sub();

        String input = ""; // 입력받는 문자열

        while (true) {
            System.out.println("===============================");
            input = h07sub.getString(input);

            if (input.equals("X") || input.equals(("x"))) {
                System.out.println("Exit program");
                break;
            } else {
                h07sub.printWorld(input);

                char[] inputArray = input.toCharArray();
                for (int i = 0; i < inputArray.length; i++)
                    System.out.println("=> " + inputArray[i]);

            }
        }

    }

}