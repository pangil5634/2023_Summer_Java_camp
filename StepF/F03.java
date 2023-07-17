package StepF;

import java.util.Scanner;

class F03 {
    public static void main(String[] args) {
        F03 stepF = new F03();
        stepF.f03();
    }

    void f03() {
        int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트
        int sum[] = new int[3]; // 3과목 총점 리스트
        double average[] = new double[3]; // 3과목 평균 리스트
        int kor, eng, mat; // 3과목 점수 입력을 위한 변수
        int i, j; // 반복문을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 값 입력 받아서 저장하기
        for (i = 0; i < 5; i++) {
            System.out.printf("Enter Korean, English, Math score of %dth student > ", i + 1);
            kor = sc.nextInt();
            eng = sc.nextInt();
            mat = sc.nextInt();

            jumsu[i][0] = kor;
            jumsu[i][1] = eng;
            jumsu[i][2] = mat;

            sum[0] += kor;
            sum[1] += eng;
            sum[2] += mat;
        }

        // 평균 계산
        for (i = 0; i < 3; i++) {
            average[i] = (double) sum[i] / 5;
        }

        // 결과 출력
        System.out.printf("Total Korean score is %d, average is %.1f\n", sum[0], average[0]);
        System.out.printf("Total English score is %d, average is %.1f\n", sum[1], average[1]);
        System.out.printf("Total Math score is %d, average is %.1f\n", sum[2], average[2]);

        sc.close();

    }
}
