package StepC;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        C06 stepB = new C06();
        stepB.c06();
    }

    void c06() {
        int kor; // 국어점수
        int eng; // 영어점수
        int math; // 수학점수
        int total; // 총점
        double average; // 평균점수

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter points of Korean > "); // 입력을 위한 출력 구문
        kor = sc.nextInt(); // kor 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter points of English > ");// 입력을 위한 출력 구문
        eng = sc.nextInt(); // eng 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter points of Math > ");// 입력을 위한 출력 구문
        math = sc.nextInt(); // math 변수에 사용자로부터 값 입력 받기

        total = kor + eng + math; // 합계 계산

        average = total / 3.0; // 평균 계산

        System.out.println("Total point is " + total); // 결과 출력 구문
        System.out.printf("The average is %.1f\n", average); // 결과 출력 구문

        checkGrade(average); // 평균 점수의 등급 판단 함수 호출
        sc.close(); // 스캐너 사용 종료
    }

    void checkGrade(double average) { // 평균 점수의 등급 판단 함수
        switch ((int) average / 10) { // 평균 점수를 10으로 나눈 값으로 등급 판단
            case 9:
                System.out.println("Your grade is A"); // 결과 출력 구문
                break;
            case 8:
                System.out.println("Your grade is B"); // 결과 출력 구문
                break;
            case 7:
                System.out.println("Your grade is C"); // 결과 출력 구문
                break;
            case 6:
                System.out.println("Your grade is D"); // 결과 출력 구문
                break;
            default:
                System.out.println("Your grade is F"); // 결과 출력 구문
                break;
        }

    }
}