package CodingTest;

import java.util.Scanner;

public class B02Sub {

    Scanner sc = new Scanner(System.in);

    int[][] setJumsu(int[][] jumsu) {
        int kor, eng, mat = 0; // 3과목 점수 입력을 위한 변수

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter Korean, English, Math score of %dth student > ", i + 1);
            kor = sc.nextInt();
            eng = sc.nextInt();
            mat = sc.nextInt();

            jumsu[i][0] = kor;
            jumsu[i][1] = eng;
            jumsu[i][2] = mat;
        }
        return jumsu;
    }

    double[] getAverage(double[] c_average, int[][] jumsu) {
        int sum = 0;
        double average = 0; // 총점, 평균, 등급 계산을 위한 변수
        String[] class_name = { "Korean", "English", "Math" }; // 과목명 리스트

        System.out.println("\n1) Total score and average for each subjects");

        for (int i = 0; i < 3; i++) {
            sum = jumsu[0][i] + jumsu[1][i] + jumsu[2][i] + jumsu[3][i] + jumsu[4][i];
            average = (double) sum / 5;
            c_average[i] = average;
            System.out.printf("Total %s score is %d, average is %.1f\n", class_name[i], sum, average);
        }

        return c_average;
    }

    void printResult(int[][] jumsu) {

        System.out.println("\n2) Total score and average for each students");

        for (int i = 0; i < 5; i++) {
            int sum = jumsu[i][0] + jumsu[i][1] + jumsu[i][2];
            double average = (double) sum / 3;
            String grade = getGrade(average);
            System.out.printf("%dth student score: Total - %d, average - %.1f, grade - %s\n", i + 1, sum, average,
                    grade);
        }
    }

    String getGrade(double average) {
        String grade = "F";

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}
