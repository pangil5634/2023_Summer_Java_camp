package StepH;

import java.util.Scanner;

public class H06Sub {

    Scanner sc = new Scanner(System.in);

    // 다섯 개 수 입력하기
    int[] getNumber(int[] number) {
        System.out.print("Enter 5 numbers from 2 to 9 > ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        return number;
    };

    // 제곱수 구하기
    int[][] getCanNumber(int[][] pow_value, int[] number) {

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                pow_value[i][j] = (int) Math.pow(number[i], number[j]);
            }
        }
        return pow_value;
    }

    // 최대값 찾기
    int searchMax(int[][] pow_value, int[] number) {

        int max = 0; // 최댓값
        int max_a = 0, max_b = 0; // 최댓값을 만들어 내는 경우의 a와 b의 값

        for (int i = 0; i < pow_value.length; i++) {
            for (int j = 0; j < pow_value.length; j++) {
                if (max < pow_value[i][j]) {
                    if (i != j) {
                        max = pow_value[i][j];
                        max_a = number[i];
                        max_b = number[j];
                    }
                }
            }
        }
        System.out.printf("Max number is %d which is %d squared of %d\n", max, max_b, max_a);
        return max;
    }

    // 최소값 찾기
    int searchMin(int[][] pow_value, int[] number) {

        int min = 50000; // 최댓값
        int min_a = 0, min_b = 0; // 최솟값을 만들어 내는 경우의 a와 b의 값
        for (int i = 0; i < pow_value.length; i++) {
            for (int j = 0; j < pow_value.length; j++) {
                if (min > pow_value[i][j]) {
                    if (i != j) {
                        min = pow_value[i][j];
                        min_a = number[i];
                        min_b = number[j];
                    }
                }
            }
        }
        System.out.printf("Min number is %d which is %d squared of %d\n", min, min_b, min_a);
        return min;
    }
}