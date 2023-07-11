package StepA;

import java.util.Scanner;

class A06 {
    public static void main(String[] args) {
        A06 stepA = new A06();
        stepA.a06();
    }

    void a06() {
        int days; // 날 수
        int seconds; // 초 단위 시간
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter number of days > "); // 입력을 위한 출력 구문
        days = sc.nextInt(); // days 변수에 사용자로부터 값 입력 받기

        seconds = days * 24 * 60 * 60;// 값 계산

        System.out.println("Total seconds is " + seconds); // 결과 출력 구문

        sc.close(); // 스캐너 사용 해제
    }
}
