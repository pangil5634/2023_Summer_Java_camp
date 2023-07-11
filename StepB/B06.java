package StepB;

import java.util.Scanner;

public class B06 {
    public static void main(String[] args) {
        B06 stepB = new B06();
        stepB.b06();
    }

    void b06() {
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

        checkGrade(kor, "Korean"); // 성적 우수인지 판단하는 함수 호출
        checkGrade(eng, "English"); // 성적 우수인지 판단하는 함수 호출
        checkGrade(math, "Math"); // 성적 우수인지 판단하는 함수 호출

        sc.close(); // 스캐너 사용 종료
    }

    void checkGrade(int grade, String subjectName) { // 성적 우수인지 판단하는 함수
        if (grade >= 90) // 성적이 90점 이상이면
            System.out.printf("%s grade is outstanding!\n", subjectName); // true
    }
}
