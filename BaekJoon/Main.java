package BaekJoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.run();
    }

    Scanner sc = new Scanner(System.in);

    void run() {
        int count = 0; // 테스트 케이스를 저장하는 변수
        count = sc.nextInt();

        // 점수 합산하는 반복문
        for (int i = 0; i < count; i++) {
            String temp = new String();
            temp = sc.next();

            char[] stringList = new char[temp.length()];
            stringList = temp.toCharArray();

            int score = 0; // 점수를 저장하는 변수
            int connect = 0; // 연속해서 맞힌 점수

            // 해당 문자열의 점수 구하는 반복문
            for (int j = 0; j < stringList.length; j++) {
                if (stringList[j] == 'O') {
                    if (connect != 0) {
                        connect++;
                    } else {
                        connect = 1;
                    }
                    score += connect;

                } else if (stringList[j] == 'X') {
                    connect = 0;
                }

            }

            // 결과 출력
            System.out.println(score);

        }
    }
}
