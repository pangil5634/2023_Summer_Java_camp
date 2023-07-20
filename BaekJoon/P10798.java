package BaekJoon;

import java.util.Scanner;

public class P10798 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        P10798 main = new P10798();

        main.run();
    }

    void run() {
        // 글자를 저장할 2차원 배열
        char[][] fiveList = new char[5][];

        // 사용자로부터 5개의 단어 입력 받기
        for (int i = 0; i < 5; i++) {
            String input = new String();
            input = sc.next();
            fiveList[i] = input.toCharArray();

        }

        // 단어 별 기준대로 출력하기
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= fiveList[j].length) // 단어의 개수보다 넘어가는 index의 경우 continue 진행
                    continue;
                System.out.print(fiveList[j][i]); // 출력
            }
        }

    }

}
