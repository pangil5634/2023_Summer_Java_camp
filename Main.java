import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepC = new Main();
        stepC.c10();
    }

    void c10() {
        int num1, num2; // 첫 번째 숫자, 두 번째 숫자

        String operator; // 연산기호문자('+', '-', '*', '/' 중 1개)

        int result = 0; // 연산 결과

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter number1 > "); // 입력을 위한 출력 구문
        num1 = sc.nextInt(); // num1 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter number2 > "); // 입력을 위한 출력 구문
        num2 = sc.nextInt(); // num2 변수에 사용자로부터 값 입력 받기

        System.out.print("Enter a math symbol('+', '-', '*', '/') "); // 입력을 위한 출력 구문
        operator = sc.next(); // operator 변수에 사용자로부터 값 입력 받기

        // operator에 따른 result 값 계산
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        }

        System.out.printf("Result is %d\n", result); // 결과 출력 구문
        sc.close(); // 스캐너 사용 해제
    }
}