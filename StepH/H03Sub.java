package StepH;

import java.util.Scanner;

public class H03Sub {

    Scanner sc = new Scanner(System.in);

    // 컴퓨터 로또 번호 구하기
    int[] getCom(int[] lotto_com) {

        int count = 0; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)

        while (count < 6) {
            int temp = (int) ((Math.random() * 45) + 1);
            lotto_com[count] = temp;
            count++;

            // 중복 체크 과정
            for (int i = 0; i < count - 1; i++) {
                if (temp == lotto_com[i]) {
                    count--;
                    break;
                }
            }

        }

        return lotto_com;
    }

    // 사용자 로또 번호 구하기
    int[] getUser(int[] lotto_user) {

        int count = 0; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)

        while (count < 6) {
            System.out.printf("Enter your %dth lotto number > ", count + 1);
            int temp = sc.nextInt();
            lotto_user[count] = temp;
            count++;

            // 중복 체크 과정
            for (int i = 0; i < count - 1; i++) {
                if (temp == lotto_user[i]) {
                    System.out.println("Invalid input!");
                    count--;
                    break;
                }
            }

        }
        return lotto_user;
    }

    // 결과 출력하기 (컴퓨터 로또 번호)
    void printResult(int[] lotto_com, int[] lotto_user) {
        System.out.print("Lotto numbers of this week are ");
        // 결과 출력
        for (int i = 0; i < 6; i++) {

            if (i == 5) {
                System.out.print(lotto_com[i] + "\n");
            } else
                System.out.print(lotto_com[i] + " ");
        }
    }

    // 결과 출력하기 (매칭된 개수)
    void compareMatch(int[] lotto_com, int[] lotto_user) {
        int match_count = 0; // 일치하는 로또 번호의 갯수 (0~6)
        for (int i = 0; i < lotto_com.length; i++) {
            for (int j = 0; j < lotto_user.length; j++) {
                if (lotto_com[i] == lotto_user[j]) {
                    match_count++;
                    break;
                }
            }
        }
        System.out.printf("There are %d matching lotto numbers\n", match_count);
    }
}
