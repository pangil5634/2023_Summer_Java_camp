package StepF;

import java.util.Scanner;

class F02 {
    public static void main(String[] args) {
        F02 stepF = new F02();
        stepF.f02();
    }

    void f02() {

        double score[] = new double[10]; // 심사점수 리스트
        float maxscore, minscore; // 가장 큰 점수, 가장 작은 점수
        float total = 0; // 점수 총 합계
        float average = 0; // 평균점수
        float newnum = 0; // 숫자 입력을 위한 변수
        int i; // 반복문을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 10개의 숫자 입력 받기
        for (i = 0; i < 10; i++) {
            System.out.printf("Enter %dth score > ", i + 1);
            newnum = sc.nextFloat();
            score[i] = newnum;
            total += newnum;
        }

        // 평균 계산
        average = (float) total / 10;

        // 결과 출력
        System.out.printf("Average is %.1f\n", average);

        sc.close();
    }
}
