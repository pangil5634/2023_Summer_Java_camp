package CodingTest;

import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        A05 CodingTestA02 = new A05();

        CodingTestA02.a05();
    }

    void a05() {
        Scanner sc = new Scanner(System.in);

        int hour, min = 0;

        // 시간, 분 입력 받기
        hour = sc.nextInt();
        min = sc.nextInt();

        // 만약 시간이 0이고, 분이 45 미만이라면 시간을 변경
        if (hour == 0 && min < 45) {
            hour = 24;
        }

        // 시간을 하나 감소하고, 분을 60 증가
        hour--;
        min += 60;

        // 45분 앞 당기기
        min -= 45;

        // 분 계산
        if (min - 45 >= 60) {
            hour++;
            min -= 45;
        }

        // 결과 출력
        System.out.println(hour + " " + min);
        sc.close();
    }
}
