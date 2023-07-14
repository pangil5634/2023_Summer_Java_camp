package CodingTest;

import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {
        A03 CodingTestA02 = new A03();

        CodingTestA02.a03();
    }

    void a03() {
        Scanner sc = new Scanner(System.in);

        int num1, num2 = 0; // 첫 번째 숫자, 두 번째 숫자

        String operator; // 연산기호문자('+', '-', '*', '/' 중 1개)

        int result = 0; // 연산 결과

        // 숫자 입력 받기
        System.out.print("Enter number1 > ");
        num1 = sc.nextInt();
        System.out.print("Enter number2 > ");
        num2 = sc.nextInt();

        // 연산기호 입력 받기
        System.out.print("Enter a math symbol('+', '-', '*', '/') ");
        operator = sc.next();

        // 값 계산하기
        if (operator.equals("+"))
            result = num1 + num2;
        else if (operator.equals("-"))
            result = num1 - num2;
        else if (operator.equals("*"))
            result = num1 * num2;
        else if (operator.equals("/"))
            result = num1 / num2;

        // 결과 출력하기
        System.out.println("Result is " + result);
        sc.close();
    }
}
