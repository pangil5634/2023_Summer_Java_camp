package BaekJoon;

import java.util.Scanner;

public class P1292 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        P1292 main = new P1292();

        main.run();
    }

    void run() {
        int[] startEnd = new int[2]; // 시작과 끝을 저장하고 있는 배열 변수
        int[] suYeol = new int[1000]; // 수열을 저장하고 있는 배열 변수
        suYeol = makeSuYeol(suYeol); // 수열 생성

        getStartEndNumber(startEnd); // 시작과 끝

        int total = 0; // 합계 변수
        total = calculateTotal(startEnd, total, suYeol);

        // 결과 출력
        System.out.println(total);
    }

    // 수열을 만드는 메소드
    int[] makeSuYeol(int[] suYeol) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (count == 1000)
                    break;
                suYeol[count] = i;
                count++;
            }
        }
        return suYeol;
    }

    // 시작과 끝을 입력 받고 출력하는 메소드
    int[] getStartEndNumber(int[] startEnd) {
        startEnd[0] = sc.nextInt(); // 시작 값 받기
        startEnd[1] = sc.nextInt(); // 끝 값 받기

        return startEnd;
    }

    // 합계를 계산하는 메소드
    int calculateTotal(int[] startEnd, int total, int[] suYeol) {
        // 합계 계산
        for (int i = startEnd[0] - 1; i < startEnd[1]; i++) {
            total += suYeol[i];
        }

        return total;
    }
}
