package StepE;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        E05 main = new E05();
        main.e05();
    }

    void e05() {
        int mode = 0; // 출력모드(1: 홀수단, 2: 짝수단)
        int column; // 열 개수
        int i, j = 0; // 반복문 사용을 위한 변수

        Scanner sc = new Scanner(System.in);

        // 출력모드 입력 받기
        System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
        mode = sc.nextInt();

        // 열 개수 입력 받기
        System.out.print("Enter a numbers of column > ");
        column = sc.nextInt();

        // 결과 출력
        if (mode == 1) {
            for (i = 3; i <= 9; i += 2) {
                for (j = 1; j <= 9; j++) {

                    if (j % column == 0) // || j == 9 구문 추가
                        System.out.printf("%d X %d = %d\n", i, j, i * j);
                    else {
                        System.out.printf("%d X %d = %d\t", i, j, i * j);
                    }
                }
                if (i != 9)
                    System.out.printf("\n");

            }
        } else if (mode == 2) {
            for (i = 2; i <= 8; i += 2) {
                for (j = 1; j <= 9; j++) {

                    if (j % column == 0) // || j == 9 구문 추가
                        System.out.printf("%d X %d = %d\n", i, j, i * j);
                    else {
                        System.out.printf("%d X %d = %d\t", i, j, i * j);
                    }
                }
                if (i != 8)
                    System.out.printf("\n");
            }
        }
        sc.close();

    }
}
