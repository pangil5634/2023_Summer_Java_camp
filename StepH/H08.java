package StepH;

import java.util.Scanner;

public class H08 {

    public static void main(String[] args) {
        H08 stepH = new H08();
        stepH.h08();
    }

    Scanner sc = new Scanner(System.in);

    /**
     * 
     */
    void h08() {
        H08Sub h08sub = new H08Sub();

        String input = ""; // 입력받는 문자열
        String findStr = ""; // 찾을 문자열
        String replaceStr = ""; // 바꾸고자 하는 문자열

        while (true) {
            int count = 0;
            System.out.println("===============================");
            input = h08sub.getInput(input);

            // 종료 조건
            if (input.equals("X") || input.equals("x")) {
                System.out.println("Exit program");
                break;
            }

            // 바꾸고자 하는 단어 입력받기
            findStr = h08sub.getFindStr(findStr);

            // 바꾸려고 하는 단어 입력받기
            replaceStr = h08sub.getReplaceStr(replaceStr);

            int index = input.indexOf(findStr);

            // 대체된 횟수 구하기
            while (index != -1) {
                count++;
                index = input.indexOf(findStr, index + findStr.length());
            }

            // 바꾼 문장 저장하기
            input = input.replaceAll(findStr, replaceStr);

            System.out.printf("=> The replacement occurred %d times\n", count);
            System.out.println("=> " + input);
        }
    }

}