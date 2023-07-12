package StepD;

import java.util.Scanner;

public class D10 {
    public static void main(String[] args) {
        D10 stepB = new D10();
        stepB.d10();
    }

    void d10() {

        int num1, num2; // 입력받은 두 수
        int i; // 반복문을 위한 변수

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언
        System.out.print("Enter two numbers > "); // 입력을 위한 출력 무누
        num1 = sc.nextInt(); // num1 변수에 사용자로부터 값 입력 받기
        num2 = sc.nextInt(); // num2 변수에 사용자로부터 값 입력 받기

        for (i = 1; i <= 100; i++) { // 1부터 100까지 반복
            if (!(i % num1 == 0 && i % num2 == 0)) { // num1과 num2의 공배수는 제외

                if (i % num1 == 0) // num1의 배수인지
                    System.out.print(i + " "); // 결과 출력 구문
                else if (i % num2 == 0) // num2의 배수인지
                    System.out.print(i + " "); // 결과 출력 구문

            }
        }
        sc.close(); // 스캐너 사용 해제

    }
}