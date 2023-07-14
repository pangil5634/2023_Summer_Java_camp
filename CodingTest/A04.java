package CodingTest;

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        A04 CodingTestA02 = new A04();

        CodingTestA02.a04();
    }

    void a04() {
        Scanner sc = new Scanner(System.in);
        int dan = 0; // 출력하려는 구구단의 단 수
        int i = 0; // 반복문을 위한 변수

        // dan 입력 받기
        while (true) {
            System.out.print("Enter number of gugudan(2~9) > ");
            dan = sc.nextInt();
            if (2 <= dan && dan <= 9)
                break;
            else {
                System.out.println("Invalid input");
            }
        }

        // 결과 출력
        for (i = 1; i <= 9; i++)
            System.out.printf("%d X %d = %d\n", dan, i, dan * i);
        sc.close();
    }
}
