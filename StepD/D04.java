package StepD;

import java.util.Scanner;

public class D04 {
    public static void main(String[] args) {
        D04 stepB = new D04();
        stepB.d04();
    }

    void d04() {

        int count_all = 0; // 가족 인원수
        int count_young = 0; // 미성년자의 수
        int birth_year = 0; // 태어난 년도
        int age = 0; // 나이
        int i = 0; // 반복문을 위한 변수

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter number of family members > "); // 입력을 위한 출력 구문
        count_all = sc.nextInt(); // count_all 변수에 사용자로부터 값 입력 받기

        for (i = 0; i < count_all; i++) { // 가족 인원 수 만큼 반복
            System.out.print("Enter a birth year > "); // 입력을 위한 출력 구문
            birth_year = sc.nextInt(); // birth_year 변수에 사용자로부터 값 입력 받기
            age = 2023 - birth_year + 1; // 나이 계산

            if (age < 20) { // 20세 미만인지
                count_young++; // 미성년자 수 증감
            }
        }

        System.out.printf("There are %d youngs in the family.\n", count_young); // 결과 출력 구문

        sc.close(); // 스캐너 사용 해제
    }
}