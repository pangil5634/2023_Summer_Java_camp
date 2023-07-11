package StepA;

import java.util.Scanner;

class A04 {
    public static void main(String[] args) {
        A04 stepA = new A04();
        stepA.a04();
    }

    void a04() {
        double m2_area; // 면적 (제곱미터)
        double pyung_area; // 면적 (평수)
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter area of Apartment(m^2) > "); // 입력을 위한 출력 구문
        m2_area = sc.nextDouble(); // m2_area 변수에 사용자로부터 값 입력 받기

        pyung_area = m2_area / 3.305; // 값 계산

        System.out.printf("Area of Apartment(평수) %.1f", pyung_area); // 결과 출력 구문

        sc.close(); // 스캐너 사용 해제
    }
}
