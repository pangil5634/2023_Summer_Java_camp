package StepJ;

import java.util.Scanner;

public class SubJ05 {

    Scanner sc = new Scanner(System.in);

    // 시간을 입력 받는 메소드
    int[] getTime(int[] hourMin) {

        hourMin[0] = sc.nextInt();
        hourMin[1] = sc.nextInt();

        return hourMin;
    }

    // 진행 여부 구하는 메소드
    char getMore(char more) {
        System.out.print("Do you want to enter more? (Y/N) > ");
        more = sc.next().charAt(0);

        return more;
    }

    // 이용 비용 구하는 메소드
    int CalcParking(int start_h, int start_m, int end_h, int end_m) {
        int total = 0;
        int startTime = start_h * 60 + start_m;
        int endTime = end_h * 60 + end_m;

        int totalTime = endTime - startTime;

        total += (totalTime / 10) * 500;
        if (totalTime % 10 != 0) {
            total += 500;
        }
        return total;
    }
}
