import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepA = new Main();
        stepA.a03();
    }

    void a03() {
        int width; // 가로크기
        int height; // 세로크기
        int area; // 직사각형의 넓이

        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter width of Rectangle > "); // 입력을 위한 출력 구문
        width = sc.nextInt(); // width 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter height of Rectangle > "); // 입력을 위한 출력 구문
        height = sc.nextInt(); // height 변수에 사용자로부터 값 입력 받기

        area = width * height; // 값 계산

        System.out.println("Area of Rectangle is " + area); // 결과 출력 구문

        sc.close(); // 스캐너 사용 해제

    }
}