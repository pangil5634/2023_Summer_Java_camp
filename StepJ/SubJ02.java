package StepJ;

import java.util.Scanner;

public class SubJ02 {

    Scanner sc = new Scanner(System.in);

    // 10개의 숫자를 입력 받는 메소드
    double[] getNumber(double[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.printf("Enter %dth score > ", i + 1);
            number[i] = sc.nextDouble();
        }
        return number;
    }

    // 최대값 구하는 메소드
    double Max(double num[]) {

        double Max = 0;
        for (double temp : num) {
            if (temp > Max) {
                Max = temp;
            }
        }

        return Max;
    }

    // 최소값 구하는 메소드
    double Min(double num[]) {

        double Min = Max(num);

        for (double temp : num) {
            if (temp < Min) {
                Min = temp;
            }
        }
        return Min;

    }

    // 평균을 구하는 메소드
    double average(double num[], double Max, double Min, double average) {

        double total = 0.0;
        for (double temp : num) {
            total += temp;
        }
        total = total - Max - Min;

        average = (double) total / 8;

        System.out.println("Average is " + average);
        return average;
    }
}
