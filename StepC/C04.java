package StepC;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        C04 stepB = new C04();
        stepB.c04();
    }

    void c04() {
        double m2_area; // 면적 (제곱미터)
        double pyung_area; // 면적 (평수)
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter area of Apartment(m^2) > "); // 입력을 위한 출력 구문
        m2_area = sc.nextDouble(); // m2_area 변수에 사용자로부터 값 입력 받기

        pyung_area = m2_area / 3.305; // 값 계산

        System.out.printf("Area of Apartment(pyung) %.1f\n", pyung_area); // 결과 출력 구문

        checkArea(pyung_area); // 아파트 종류 판단 함수 호출

        sc.close(); // 스캐너 사용 해제
    }

    void checkArea(double area) { // 아파트 종류 판단 함수
        if (area < 15) { // 평수가 15평 미만이면
            System.out.println("It is small-sized apartment"); // true
        } else if (area < 30) {// 평수가 30평 미만이면
            System.out.println("It is small and medium-sized apartment"); // true
        } else if (area < 50) {// 평수가 50평 미만이면
            System.out.println("It is medium-sized apartment"); // true
        } else {// 평수가 50평 이상이면
            System.out.println("It is big-sized apartment"); // false
        }
    }
}