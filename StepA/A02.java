package StepA;

import java.util.Scanner;

class A02 {
    public static void main(String[] args) {
        A02 stepA = new A02();
        stepA.a02();
    }

    void a02() {
        double c_degree; // 섭씨 온도
        double f_degree; // 화씨 온도
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter Celsius temperature > "); // 입력을 위한 출력 구문
        c_degree = sc.nextDouble(); // c_degree 변수에 사용자로부터 값 입력 받기

        f_degree = (c_degree * 1.8) + 32; // 온도 변환

        System.out.println("Fahrenheit temperature is " + f_degree); // 결과 출력 구문

        sc.close(); // 스캐너 사용 해제
    }
}