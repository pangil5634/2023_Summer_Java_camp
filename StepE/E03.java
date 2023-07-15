package StepE;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        E03 main = new E03();
        main.e03();
    }

    void e03() {
        int height; // 입력받은 높이
        int i, j; // 반복문 사용을 위한 변수
        Scanner sc = new Scanner(System.in);

        // 높이 입력 받기
        System.out.print("Enter a height of triangle > ");
        height = sc.nextInt();

        // 결과 출력하기
        for (i = 1; i <= 20; i++) {
            for (j = 20 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j < i * 2 - 1; j++)
                System.out.print("*");

            System.out.print("\n");
        }
        sc.close();
    }
}
