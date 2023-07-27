package StepH;

import java.util.Scanner;

public class H04 {

    public static void main(String[] args) {
        H04 stepH = new H04();
        stepH.h04();
    }

    Scanner sc = new Scanner(System.in);

    void h04() {
        H04Sub h02sub = new H04Sub();

        int com_finger = 0; // 컴퓨터가 낸 가위(1), 바위(2), 보(3)

        int my_finger = 0; // 사용자가 낸 가위(1), 바위(2), 보(3)

        int score[][] = new int[2][3];// 결과 횟수 리스트 [[컴퓨터의 승, 무, 패], [사용자의 승, 무, 패]]

        while (true) {

            // 사용자로부터 입력 받가
            my_finger = h02sub.getUser(my_finger);

            // 종료 조건
            if (my_finger == 0) {
                h02sub.printResult(score);
                break;
            }

            // 컴퓨터로부터 입력 받기
            com_finger = h02sub.getCompu(com_finger);

            // 결과 비교하기
            score = h02sub.compareResult(my_finger, com_finger, score);
        }

    }

}