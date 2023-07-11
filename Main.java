import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepC = new Main();
        stepC.c11();
    }

    void c11() {
        int year; // 입력받은 년도
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter a year > "); // 입력을 위한 출력 구문
        year = sc.nextInt(); // year 변수에 사용자로부터 값 입력 받기

        boolean checkYoonyear = false; // 윤년 판단을 위한 변수

        if (year % 4 == 0) { // 년도가 4로 나누어 떨어지는 경우
            checkYoonyear = true;
            if (year % 100 == 0) { // 년도가 100으로 떨어지는 경우
                checkYoonyear = false;
            }
            if (year % 400 == 0) { // 년도가 400으로 떨어지는 경우
                checkYoonyear = true;
            }
        }

        if (checkYoonyear == true) { // 윤년인지
            System.out.println("This year is leap year"); // true
        } else {
            System.out.println("This year is not leap year"); // false
        }

        sc.close(); // 스캐너 사용 해제
    }
}