package BaekJoon;

import java.util.Scanner;

public class P10870 {
    public static void main(String[] args) {

        P10870 main = new P10870();

        main.run();
    }

    Scanner sc = new Scanner(System.in);

    void run() {
        int number = 0; // 입력 받을 피보나치 수를 저장하는 변수
        number = sc.nextInt();

        int result = 0; // 출력 될 값을 저장하는 변수

        // 기준에 맞춰서 result 구하기
        if (number == 0) {
            result = 0;
        } else if (number == 1) {
            result = 1;
        } else {

            int fib = 1;
            int prevFib = 1;

            for (int i = 2; i < number; i++) {
                int temp = fib;
                fib += prevFib;
                prevFib = temp;
            }

            result = fib;
        }

        // 결과 출력하기
        System.out.println(result);

    }
}
