package StepB;

import java.util.Scanner;

public class B01 {
    public static void main(String[] args) {
        B01 stepB = new B01();
        stepB.b01();
    }

    void b01() {
        int birth_year; // 태어난 년도
        int age; // 나이

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter a birth year > "); // 입력을 위한 출력 구문
        birth_year = sc.nextInt(); // birth_year 변수에 사용자로부터 값 입력 받기

        age = 2023 - birth_year + 1; // 나이 계산

        ageResult(age);

        sc.close(); // 스캐너 사용 해제
    }

    void ageResult(int age) {
        if (age < 20)
            System.out.println("You are not adult");
        else if (age >= 20)
            System.out.println("You are adult");
    }

}
