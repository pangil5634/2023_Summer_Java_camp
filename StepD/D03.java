package StepD;

import java.util.Scanner;

public class D03 {
    public static void main(String[] args) {
        D03 stepB = new D03();
        stepB.d03();
    }

    void d03() {
        int number; // 입력받은 수
        int count = 0; // 입력받은 숫자의 개수
        int totalsum = 0; // 총합계
        double average = 0.0; // 평균 값

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        while (true) { // 반복문
            System.out.print("Enter a number from 0 to 100 > "); // 입력을 위한 출력 구문
            number = sc.nextInt(); // number 변수에 사용자로부터 값 입력 받기

            if (0 <= number && number <= 100) { // 값이 0에서 100 사이의 숫자인 경우
                count++; // 숫자 개수 증감
                totalsum += number; // 합계에 입력받은 수 합산
            } else {
                break; // 값이 0에서 100 사이의 숫자가 아닌 경우
            }
        }

        average = (double) totalsum / count; // 평균 값 계산

        System.out.printf("The sum of %d numbers is %d, average is %.1f\n", count, totalsum, average); // 결과 출력 구문

        sc.close(); // 스캐너 사용 해제
    }
}