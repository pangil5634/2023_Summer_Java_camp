package StepF;

import java.util.Scanner;

class F01 {
    public static void main(String[] args) {
        F01 stepF = new F01();
        stepF.f01();
    }

    void f01() {

        int[] num = new int[10]; // 10개의 숫자를 담을 리스트

        int first = 0; // 첫 번째로 큰 수
        int second = 0; // 두 번째로 큰 수
        int second_max_index = 0; // 두 번째로 큰 수의 인덱스
        int first_max_index = 0;
        int newnum; // 숫자 입력을 위한 변수
        int i; // 반복문을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 10개 숫자 입력 받기
        for (i = 0; i < 10; i++) {
            System.out.printf("Enter %dth number > ", i + 1);
            newnum = sc.nextInt();

            num[i] = newnum;

        }

        // 숫자 순서 구별
        if (num[0] > num[1]) {
            first = num[0];
            second = num[1];
            first_max_index = 0;
            second_max_index = 1;
        } else if (num[0] < num[1]) {
            first = num[1];
            second = num[0];
            first_max_index = 1;
            second_max_index = 0;
        }

        for (i = 2; i < 10; i++) {
            if (num[i] > first) {
                second = first;
                first = num[i];
                second_max_index = first_max_index;
                first_max_index = i;
            } else if (num[i] > second) {
                second = num[i];
                second_max_index = i;
            }
        }

        // 결과 출력
        System.out.printf("Second largest number is %dth number %d\n", second_max_index + 1, second);

        sc.close();
    }
}
