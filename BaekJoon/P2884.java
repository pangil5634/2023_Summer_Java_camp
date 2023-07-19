package BaekJoon;

import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        P2884 main = new P2884();

        main.run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int hour = 0;
        int min = 0;

        // 시간, 분 입력 받기
        hour = sc.nextInt();
        min = sc.nextInt();

        // 입력한 시간이 0시인 경우
        if (hour == 0 && min < 45) {
            hour = 24; // 24시로 변경
        }

        // 한 시간 줄이고, 60분을 증가
        hour--;
        min += 60;

        // 바람대로 45분 앞당기기
        min -= 45;

        // 만약 분이 60분을 넘어간 경우 시간 증가
        if (min - 60 >= 0) {
            min -= 60;
            hour++;
        }

        // 결과 출력
        System.out.print(hour + " " + min);
        sc.close();
    }
}
