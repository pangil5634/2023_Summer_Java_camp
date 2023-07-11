package StepC;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {
        C09 stepB = new C09();
        stepB.c09();
    }

    void c09() {
        int income; // 연봉 (원 단위)
        int tax = 0; // 소득세 (원 단위)

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter your income > "); // 입력을 위한 출력 구문
        income = sc.nextInt(); // income 변수에 사용자로부터 값 입력 받기

        if (income > 0) { // 연봉이 0원 초과인지
            if (income < 10000000) { // 천만원 미만
                tax = income / 1000 * 95;
            } else if (income < 40000000) { // 4천만원 미만
                tax = income / 10 * 19;
            } else if (income < 80000000) { // 8천만원 미만
                tax = income / 100 * 28;
            } else if (income > 80000000) { // 8천만원 이상
                tax = income / 100 * 37;
            }
            System.out.printf("Income tax on salary is %d\n", tax); // 결과 출력 구문
        } else {
            System.out.println("Wrong Input"); // 연봉이 0원 초과가 아닌 경우
        }

        sc.close(); // 스캐너 사용 해제
    }
}