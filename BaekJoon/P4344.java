package BaekJoon;

import java.util.Scanner;

public class P4344 {

    public static void main(String[] args) {

        P4344 main = new P4344();

        main.run();
    }

    Scanner sc = new Scanner(System.in);

    void run() {

        int count = 0; // 테스트 케이스 개수를 저장하는 변수
        count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int student = 0; // 학생 수를 저장하는 변수
            student = sc.nextInt();
            int[] studentList = new int[student]; // 학생 별 점수를 저장하는 변수

            int total = 0; // 학생들의 점수의 합을 저장하는 변수

            // 학생들의 점수를 입력 받아 저장하고, 총합을 구하는 반복문
            for (int j = 0; j < student; j++) {
                studentList[j] = sc.nextInt();
                total += studentList[j];
            }

            double average = 0; // 학생들의 점수의 평균을 저장하는 변수
            average = (double) total / student; // 평균을 구하는 구문

            int highStudent = 0; // 평균보다 성적이 높은 학생의 수를 저장하는 변수

            // 평균보다 성적이 높은 학생의 수를 구하는 반복문
            for (int j = 0; j < student; j++) {
                if (studentList[j] > average) {
                    highStudent++;
                }
            }

            System.out.printf("%.3f%%\n", (double) highStudent / student * 100); // 결과 출력
        }
    }
}
