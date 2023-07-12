package StepD;

import java.util.Scanner;

public class D01 {
    public static void main(String[] args) {
        D01 stepB = new D01();
        stepB.d01();
    }

    void d01() {

        int number; // 입력받은 수
        int totalsum = 0; // 1부터 더한 계산 결과 값
        int i = 1; // 반복문 사용을 위한 변수
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter a number > "); // 입력을 위한 출력 구문
        number = sc.nextInt(); // number 변수에 사용자로부터 값 입력 받기

        if (number <= 1) { // number이 1보다 크지 않은 경우
            System.out.println("Invalid input"); // 결과 출력 구문
        } else { // number이 1보다 큰 경우
            for (i = 1; i <= number; i++) { // 1부터 이 숫자까지의 모든 정수 더하기
                totalsum += i;
            }
            System.out.println("The sum of all integer from 1 to the number entered is " + totalsum); // 결과 출력 구문
        }

        sc.close(); // 스캐너 사용 해제
    }
}