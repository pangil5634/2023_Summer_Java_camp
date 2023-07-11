import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepC = new Main();
        stepC.c08();
    }

    void c08() {

        int num1, num2, num3; // 첫 번째 숫자, 두 번째 숫자, 세 번째 숫자
        int max_num, min_num; // 가장 큰 숫자, 가장 작은 숫자
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언
        System.out.print("Enter first number > "); // 입력을 위한 출력 구문
        num1 = sc.nextInt(); // num1 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter second number > "); // 입력을 위한 출력 구문
        num2 = sc.nextInt(); // num2 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter third number > "); // 입력을 위한 출력 구문
        num3 = sc.nextInt(); // num3 변수에 사용자로부터 값 입력 받기

        max_num = checkMax(num1, num2, num3); // 최대값 찾는 함수 호출
        min_num = checkMin(num1, num2, num3); // 최소값 찾는 함수 호출
        System.out.printf("Max number is %d, Min number is %d\n", max_num, min_num);
        sc.close(); // 스캐너 사용 해제
    }

    int checkMax(int num1, int num2, int num3) { // 최대값 찾는 함수
        int max_num = num1; // 최대값 초기 지정

        // 최대값 찾는 구문
        if (num2 > num3) {
            if (max_num < num2) {
                max_num = num2;
            }
        } else {
            if (max_num < num3) {
                max_num = num3;
            }
        }

        // 최대값 return
        return max_num;
    }

    int checkMin(int num1, int num2, int num3) { // 최소값 찾는 함수
        int min_num = num1;// 최소값 초기 지정

        // 최소값 찾는 구문
        if (num2 < num3) {
            if (min_num > num2) {
                min_num = num2;
            }
        } else {
            if (min_num > num3) {
                min_num = num3;
            }
        }
        // 최소값 return
        return min_num;
    }
}