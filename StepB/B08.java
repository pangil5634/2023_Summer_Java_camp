package StepB;

import java.util.Scanner;

public class B08 {
    public static void main(String[] args) {
        B08 stepB = new B08();
        stepB.b08();
    }

    void b08() {

        int num1, num2, num3; // 첫 번째 숫자, 두 번째 숫자, 세 번째 숫자
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언
        System.out.print("Enter first number "); // 입력을 위한 출력 구문
        num1 = sc.nextInt(); // num1 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter second number "); // 입력을 위한 출력 구문
        num2 = sc.nextInt(); // num2 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter third number "); // 입력을 위한 출력 구문
        num3 = sc.nextInt(); // num3 변수에 사용자로부터 값 입력 받기

        checkLeastTwoNumberSame(num1, num2, num3); // 3개의 숫자 중 적어도 두 수의 값이 갖은지 확인하는 함수 호출
        checkLeastTwoNumberOver50(num1, num2, num3); // 3개의 숫자 중 적어도 두 수의 크기가 모두 50보다 큰지 확인하는 함수 호출
        checkSumSameNum(num1, num2, num3); // 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같은지 확인하는 함수 호출
        checkNumDivideNum(num1, num2, num3); // 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어 떨어지는지 확인하는 함수 호출

        sc.close(); // 스캐너 사용 해제

    }

    void checkLeastTwoNumberSame(int num1, int num2, int num3) { // 3개의 숫자 중 적어도 두 수의 값이 갖은지 확인하는 함수

        boolean result = false; // 출력 여부를 위한 참 판단 변수

        if (num1 == num2) { // num1과 num2가 같은지
            result = true;
        } else if (num2 == num3) { // num2와 num3이 같은지
            result = true;
        } else if (num3 == num1) { // num3과 num1이 같은지
            result = true;
        }

        if (result == true) { // 값이 참이면 출력
            System.out.println("Satisfies the first condition");
        }
    }

    void checkLeastTwoNumberOver50(int num1, int num2, int num3) { // 3개의 숫자 중 적어도 두 수의 크기가 모두 50보다 큰지 확인하는 함수

        boolean result = false;// 출력 여부를 위한 참 판단 변수

        if (num1 > 50) { // num1이 50보다 크고
            if (num2 > 50) { // num2이 50보다 크면
                result = true;
            }
        } else if (num2 > 50) {// num2이 50보다 크고
            if (num3 > 50) { // num3이 50보다 크면
                result = true;
            }
        } else if (num3 > 50) {// num3이 50보다 크고
            if (num1 > 50) { // num1이 50보다 크면
                result = true;
            }
        }

        if (result == true) {// 값이 참이면 출력
            System.out.println("Satisfies the second condition");
        }
    }

    void checkSumSameNum(int num1, int num2, int num3) {// 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같은지 확인하는 함수

        boolean result = false; // 출력 여부를 위한 참 판단 변수

        if (num1 + num2 == num3) { // num1과 num2의 합이 num3과 같으면
            result = true;
        } else if (num1 + num3 == num2) {// num1과 num3의 합이 num2과 같으면
            result = true;
        } else if (num2 + num3 == num1) {// num2과 num3의 합이 num1과 같으면
            result = true;
        }

        if (result == true) {// 값이 참이면 출력
            System.out.println("Satisfies the third condition");
        }
    }

    void checkNumDivideNum(int num1, int num2, int num3) { // 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어 떨어지는지 확인하는 함수

        boolean result = false; // 출력 여부를 위한 참 판단 변수

        if (num2 % num1 == 0) { // num1로 num2를 나눌 수 있으면
            if (num3 % num1 == 0) { // num1로 num3을 나눌 수 있으면
                result = true;
            }
        } else if (num1 % num2 == 0) {// num2로 num1를 나눌 수 있으면
            if (num3 % num2 == 0) {// num2로 num3를 나눌 수 있으면
                result = true;
            }
        } else if (num1 % num3 == 0) {// num3로 num1를 나눌 수 있으면
            if (num2 % num3 == 0) {// num3로 num2를 나눌 수 있으면
                result = true;
            }
        }
        if (result == true) {// 값이 참이면 출력
            System.out.println("Satisfies the fourth condition");
        }
    }
}
