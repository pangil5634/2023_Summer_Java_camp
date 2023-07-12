package StepD;

import java.util.Scanner;

public class D07 {
    public static void main(String[] args) {
        D07 stepB = new D07();
        stepB.d07();
    }

    void d07() {

        int a, b; // 1차 함수의 계수 a, b
        int x_begin, x_end; // x좌표의 시작 값과 끝 값
        int x = 0, y = 0; // x좌표, y좌표

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter the coefficients a and b of linear function(y=ax+b) > "); // 입력을 위한 출력 구문
        a = sc.nextInt(); // a 변수에 사용자로부터 값 입력 받기
        b = sc.nextInt();// b 변수에 사용자로부터 값 입력 받기

        System.out.print("Enter the start and end values of x coordinates > ");// 입력을 위한 출력 구문
        x_begin = sc.nextInt();// x_begin 변수에 사용자로부터 값 입력 받기
        x_end = sc.nextInt();// x_end 변수에 사용자로부터 값 입력 받기

        for (int i = x_begin; i <= x_end; i++) { // x_begin부터 x_end 사이의 x 값에 대한 1차 함수 (x, y) 좌표 출력 반복
            x = i; // x의 위치는 x_begin 값
            y = a * x + b; // y의 값은 함수 계산 값
            System.out.printf("coordinates (%d, %d)\n", x, y); // 결과 출력 구문
        }

        sc.close(); // 스캐너 사용 해제
    }
}