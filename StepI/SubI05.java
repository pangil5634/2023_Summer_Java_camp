package StepI;

import java.util.Scanner;

public class SubI05 {

    Scanner sc = new Scanner(System.in);

    // 10개의 숫자를 입력 받아 배열을 리턴하는 메소드
    int[] getNumber(int[] number) {

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter %dth number > ", i + 1);
            number[i] = sc.nextInt();
        }

        return number;
    }

    // 최대값을 찾는 메소드
    int MaxOfTen() {
        int[] number = new int[10];
        number = getNumber(number);

        int max = 0;

        for (int temp : number) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
