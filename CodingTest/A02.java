package CodingTest;

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {
        A02 CodingTestA02 = new A02();

        CodingTestA02.a02();
    }

    void a02() {
        Scanner sc = new Scanner(System.in);

        double m2_area = 0; // 면적 (제곱미터)
        double pyung_area = 0; // 면적 (평수)

        // 면접 입력 받기
        System.out.print("Enter area of Apartment(m^2) > ");
        m2_area = sc.nextDouble();

        // 평 계산
        pyung_area = m2_area / 3.305;

        // 결과 출력
        System.out.printf("Area of Apartment(평수) %.1f\n", pyung_area);

        if (pyung_area < 30) {
            System.out.println("It is small apartment");
        } else if (pyung_area >= 30) {
            System.out.println("It is big apartment");
        }
        sc.close();
    }
}
