package StepC;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        C02 stepB = new C02();
        stepB.c02();
    }

    void c02() {
        double input_degree; // 입력받은 온도

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter water temperature > "); // 입력을 위한 출력 구문
        input_degree = sc.nextDouble(); // input_degree 변수에 사용자로부터 값 입력 받기

        if (input_degree < 0) { // 음수값인지
            System.out.println("Invalid input!"); // 결과 출력 구문
        } else if (input_degree < 25) { // 0도 이상 ~ 25도 미만인지
            System.out.println("It's cold water"); // 결과 출력 구문
        } else if (input_degree < 40) { // 25도 이상 ~ 40도 미만인지
            System.out.println("It's warm water"); // 결과 출력 구문
        } else if (input_degree < 80) { // 40도 이상 ~ 80도 미만인지
            System.out.println("It's hot water"); // 결과 출력 구문
        } else { // 80도 이상이면
            System.out.println("It's boiling water"); // 결과 출력 구문
        }
        sc.close(); // 스캐너 사용 해제
    }
}