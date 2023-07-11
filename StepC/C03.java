package StepC;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        C03 stepB = new C03();
        stepB.c03();
    }

    void c03() {
        int width, height; // 가로크기, 세로크기
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter width of Rectangle > "); // 입력을 위한 출력 구문
        width = sc.nextInt(); // width 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter height of Rectangle > "); // 입력을 위한 출력 구문
        height = sc.nextInt(); // height 변수에 사용자로부터 값 입력 받기

        checkResult(width, height);// 직사각형 형태 판정 함수 호출
        sc.close(); // 스캐너 사용 해제
    }

    void checkResult(int width, int height) { // 직사각형 형태 판정 함수
        if (width == height)// 가로 크기와 세로 크기가 동일한지
            System.out.println("It is square"); // 결과 출력 구문
        else if (width >= height * 2) {// 가로 크기가 세로 크기의 2배 이상인지
            System.out.println("It is an oblong rectangle from side to side."); // 결과 출력 구문
        } else if (height >= width * 2) {// 세로 크기가 가로 크기의 2배 이상인지
            System.out.println("It is an oblong rectangle from top to bottom."); // 결과 출력 구문
        } else if (width > height) {// 가로 크기가 세로 크기보다 큰지
            System.out.println("It is a horizontal rectangle."); // 결과 출력 구문
        } else if (width < height) {// 세로 크기가 가로 크기보다 큰지
            System.out.println("It is a vertical rectangle."); // 결과 출력 구문
        }
    }
}