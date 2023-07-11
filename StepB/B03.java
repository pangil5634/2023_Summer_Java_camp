package StepB;

import java.util.Scanner;

public class B03 {
    public static void main(String[] args) {
        B03 stepB = new B03();
        stepB.b03();
    }

    void b03() {
        int width; // 가로크기
        int height; // 세로크기
        int area; // 직사각형의 넓이

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter width of Rectangle > "); // 입력을 위한 출력 구문
        width = sc.nextInt(); // width 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter height of Rectangle > "); // 입력을 위한 출력 구문
        height = sc.nextInt(); // height 변수에 사용자로부터 값 입력 받기

        area = width * height; // 값 계산

        System.out.println("Area of Rectangle is " + area + " and"); // 결과 출력 구문
        checkRectangle(width, height); // 정사각형 판정 함수 호출

        sc.close(); // 스캐너 사용 해제
    }

    void checkRectangle(int width, int height) { // 정사각형 판정 함수
        if (width == height) { // 가로 크기와 세로 크기가 같으면
            System.out.println("it is square"); // true
        } else {
            System.out.println("it is not square"); // false
        }
    }
}
