package StepD;

import java.util.Scanner;

public class D02 {
    public static void main(String[] args) {
        D02 stepB = new D02();
        stepB.d02();
    }

    void d02() {

        int number = 0; // 입력받은 수

        int max_num = 0, min_num = 100; // 가장 큰 숫자, 가장 작은 숫자
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        while (true) { // 반복문
            System.out.print("Enter a number > "); // 입력을 위한 출력 구문
            number = sc.nextInt(); // number 변수에 사용자로부터 값 입력 받기
            if (0 <= number && number <= 100) { // 값이 0에서 100 사이의 숫자인 경우

                if (number > max_num) { // number이 최대값보다 큰 경우
                    max_num = number;
                }

                if (number < min_num) { // number이 최소값보다 작은 경우
                    min_num = number;
                }

            } else {
                break; // 값이 0에서 100 사이의 숫자가 아닌 경우
            }
        }

        System.out.printf("Max number is %d, Min number is %d\n", max_num, min_num); // 결과 출력 구문
        sc.close(); // 스캐너 사용 해제
    }
}