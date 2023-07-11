package StepC;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        C05 stepB = new C05();
        stepB.c05();
    }

    void c05() {
        int month, day; // 월, 일

        int day_count = 0; // 1년 중 날 수
        Scanner sc = new Scanner(System.in); // 스캐너 사용 선언

        System.out.print("Enter a month > "); // 입력을 위한 출력 구문
        month = sc.nextInt(); // month 변수에 사용자로부터 값 입력 받기
        System.out.print("Enter a day > "); // 입력을 위한 출력 구문
        day = sc.nextInt(); // day 변수에 사용자로부터 값 입력 받기

        if (month < 1 || month > 12 || day == 0) { // 입력한 달의 범위 및 day 범위 판단
            System.out.println("This date is not valid."); // 범위를 벗어나면 출력하는 결과 출력 구문
        } else { // 정상적으로 범위 안에 든 경우

            boolean result = true; // 실행 여부 판단 변수

            // 각 월이 갖고 있는 일의 범위 판단 구문
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day > 31) {
                    System.out.println("This date is not valid.");
                    result = false;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30) {
                    System.out.println("This date is not valid.");
                    result = false;
                }
            } else if (month == 2) {
                if (day > 28) {
                    System.out.println("This date is not valid.");
                    result = false;
                }
            }

            // 정상적으로 월과 일을 입력한 경우
            if (result != false) {
                for (int i = 1; i < month; i++) { // 입력한 달 이전까지의 달의 일 합산
                    if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                        day_count += 31;
                    } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                        day_count += 30;
                    } else if (i == 2) {
                        day_count += 28;
                    }
                }

                day_count += day; // 입력한 일의 수까지 합산

                // 결과 출력 구문
                if (day_count == 1) {
                    System.out.printf("This data is %dst of the year\n", day_count);
                } else if (day_count == 2) {
                    System.out.printf("This data is %dnd of the year\n", day_count);
                } else if (day_count == 3) {
                    System.out.printf("This data is %drd of the year\n", day_count);
                } else
                    System.out.printf("This date is %dth of the year\n", day_count);
            }
        }
        sc.close(); // 스캐너 사용 해제
    }
}