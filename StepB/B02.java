package StepB;

import java.util.Scanner;

public class B02 {
    public static void main(String[] args) {
        B02 stepB = new B02();
        stepB.b02();
    }

    void b02() {
        double input_degree; // 입력받은 온도
        String kind; // 온도의 종류, 섭씨온도이면 'C', 화씨온도이면 'F'
        double output_degree; // 변환한 온도

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter temperature > "); // 입력을 위한 출력 구문
        input_degree = sc.nextDouble(); // c_degree 변수에 사용자로부터 값 입력 받기

        System.out.print("Enter type of temperature('C' for Celsius, 'F' for Fahrenheit) ");
        kind = sc.next(); // kind 변수에 사용자로부터 값 입력 받기

        if (kind.equals("C")) { // 섭씨 온도를 입력한 경우
            output_degree = (input_degree * 1.8) + 32; // 값 계산
            System.out.println("Fahrenheit temperature is " + output_degree); // 결과 출력 구문
        } else if (kind.equals("F")) { // 화씨 온도를 입력한 경우
            output_degree = (input_degree - 32) / 1.8; // 값 계산
            System.out.println("Celsius temperature is " + output_degree); // 결과 출력 구문
        }

        sc.close(); // 스캐너 사용 해제
    }
}
