package StepE;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        E01 main = new E01();
        main.e01();
    }

    void e01() {
        int length; // 입력받은 정사각형 한 변의 길이
        int i, j; // 반복문 사용을 위한 변수
        Scanner sc = new Scanner(System.in);

        // 정사각형 한 변의 길이 입력 받기
        System.out.print("Enter a length of rectangle > ");
        length = sc.nextInt();

        // 결과 출력하기
        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }

        sc.close();

    }
}
