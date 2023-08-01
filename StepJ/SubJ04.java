package StepJ;

import java.util.Scanner;

public class SubJ04 {

    Scanner sc = new Scanner(System.in);

    // 월, 일 입력 받는 메소드
    int[] getMonthDay(int[] monthDay) {
        monthDay[0] = sc.nextInt(); // month 변수에 사용자로부터 값 입력 받기
        monthDay[1] = sc.nextInt(); // day 변수에 사용자로부터 값 입력 받기

        return monthDay;
    }

    // 입력 에러 판단 메소드
    boolean printInputError(int[] monthDay) {
        boolean Invalid = false;
        if (monthDay[0] < 1 || monthDay[0] > 12 || monthDay[1] == 0) { // 입력한 달의 범위 및 day 범위 판단
            Invalid = true;
        }

        // 각 월이 갖고 있는 일의 범위 판단 구문
        if (monthDay[0] == 1 || monthDay[0] == 3 || monthDay[0] == 5 || monthDay[0] == 7 || monthDay[0] == 8
                || monthDay[0] == 10 || monthDay[0] == 12) {
            if (monthDay[1] > 31) {
                Invalid = true;
            }
        } else if (monthDay[0] == 4 || monthDay[0] == 6 || monthDay[0] == 9 || monthDay[0] == 11) {
            if (monthDay[1] > 30) {
                Invalid = true;
            }
        } else if (monthDay[0] == 2) {
            if (monthDay[1] > 28) {
                Invalid = true;
            }
        }

        return Invalid;
    }

    // 날짜 간격 세는 메소드
    int CalcDate(int month, int day) {
        int area = 0;
        for (int i = 1; i < month; i++) { // 입력한 달 이전까지의 달의 일 합산
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                area += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                area += 30;
            } else if (i == 2) {
                area += 28;
            }
        }

        area += day; // 입력한 일의 수까지 합산

        return area;
    }
}
