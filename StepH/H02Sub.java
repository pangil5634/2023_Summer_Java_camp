package StepH;

import java.util.Scanner;

public class H02Sub {

    Scanner sc = new Scanner(System.in);

    // 로또 점수를 만드는 메소드
    void setLotto() {
        int lotto[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트
        int count = 0; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)

        while (count < 6) {
            int temp = (int) ((Math.random() * 45) + 1);
            lotto[count] = temp;
            count++;

            // 중복 체크 과정
            for (int i = 0; i < count - 1; i++) {
                if (temp == lotto[i]) {
                    count--;
                    break;
                }
            }

        }

        // 결과 출력
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.print(lotto[i] + "\n");
            } else
                System.out.print(lotto[i] + ", ");
        }

    }
}