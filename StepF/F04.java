package StepF;

import java.util.Scanner;

class F04 {
    public static void main(String[] args) {
        F04 stepF = new F04();
        stepF.f04();
    }

    void f04() {
        int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트
        int sum[] = new int[5]; // 각 학생의 총점 리스트
        double average[] = new double[5]; // 각 학생의 평균 리스트
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

            sum[i] += kor + eng + mat;
            average[i] = (double) sum[i] / 3;
        }

        // 결과 출력
        for (i = 0; i < 5; i++) {
            System.out.printf("Total score of %dth student is %d, average is %.1f\n", i + 1, sum[i], average[i]);
        }

        sc.close();

    }
}
