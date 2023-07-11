package StepA;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepA = new Main();
        stepA.a01();
    }

    void a01() {

        int birth_year; // 태어난 년도
        int age; // 나이
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter a birth year > "); // 입력을 위한 출력 구문
        birth_year = sc.nextInt(); // birth_year 변수에 사용자로부터 값 입력 받기

        age = 2022 - birth_year + 1; // 나이 계산

        System.out.println("You are " + age + " years old."); // 결과 출력 구문

        sc.close(); // 스캐너 사용 해제
    }
}