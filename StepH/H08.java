package StepH;

import java.util.Scanner;

public class H08 {

    public static void main(String[] args) {
        H08 stepH = new H08();
        stepH.h07();
    }

    Scanner sc = new Scanner(System.in);

    /**
     * 
     */
    void h07() {
        H08Sub h08sub = new H08Sub();

        String input = ""; // 입력받는 문자열
        String findStr = ""; // 찾을 문자열
        String replaceStr = ""; // 바꾸고자 하는 문자열
        int count = 0;

        while (true) {

            input = h08sub.getInput(input);
            if (input.equals("X") || input.equals("x")) {
                System.out.println("Exit program");
                break;
            }
            System.out.println(input);

            findStr = h08sub.getFindStr(findStr);

            replaceStr = h08sub.getReplaceStr(replaceStr);

            input = input.replaceAll(findStr, replaceStr);

            for (int i = 0; i < input.length(); i++) {
                if (input.equals(findStr)) {
                    count++;
                }
            }
            System.out.println("=> " + input);
        }
    }

}