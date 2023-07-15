package StepE;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        E02 main = new E02();
        main.e02();
    }

    void e02() {

        int height; // 입력받은 높이
        int blank; // 입력받은 여백 크기
        int i, j; // 반복문 사용을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 높이, 여백 받기
        System.out.print("Enter a height of right triangle and black > ");
        height = sc.nextInt();
        blank = sc.nextInt();

        // 결과 출력
        for (i = 1; i <= height; i++) {
            for (j = 0; j < height + blank - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
