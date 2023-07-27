package StepH;

import java.util.Scanner;

public class H03 {

    public static void main(String[] args) {
        H03 stepH = new H03();
        stepH.h03();
    }

    Scanner sc = new Scanner(System.in);

    void h03() {

        int lotto_com[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트
        int lotto_user[] = new int[6]; // 사용자가 입력한 로또 번호 리스트

        H03Sub h02sub = new H03Sub();

        // 컴퓨터 로또 번호 구하기
        lotto_com = h02sub.getCom(lotto_com);

        // 사용자 로또 번호 구하기
        lotto_user = h02sub.getUser(lotto_user);

        // 결과 출력하기 (컴퓨터 로또 번호)
        h02sub.printResult(lotto_com, lotto_user);

        // 결과 출력하기 (매칭된 개수)
        h02sub.compareMatch(lotto_com, lotto_user);

    }

}