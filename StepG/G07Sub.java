package StepG;

import java.util.Scanner;

public class G07Sub {
    Scanner sc = new Scanner(System.in);
    int[] v_count = new int[4]; // 연령별 방문자 합계
    int total_count = 0; // 총 방문자 수
    int total_sum = 0; // 총 요금

    // 팀 개수를 입력 받는 메소드
    public int getTeamCount() {
        int team_count = 0; // 방문한 팀수

        System.out.print("Enter number of team > "); // 입력을 위한 출력 구문
        team_count = sc.nextInt(); // 방문한 팀수 입력 받기

        System.out.println();
        return team_count;
    }

    // 팀 별 구성원 수를 입력 받는 메소드
    public int[] getCount(int[] count, int index) {
        // 입력을 위한 출력 구문
        System.out.printf("Enter a number of %d th team member (child, youth, adult, old) > ", index + 1);

        count[0] = sc.nextInt(); // child
        count[1] = sc.nextInt(); // youth
        count[2] = sc.nextInt(); // adult
        count[3] = sc.nextInt(); // old

        v_count[0] += count[0]; // child
        v_count[1] += count[1]; // youth
        v_count[2] += count[2]; // adult
        v_count[3] += count[3]; // old

        total_count += count[0] + count[1] + count[2] + count[3]; // 총 방문자 수에 더하기

        return count;
    }

    // 멤버십을 입력 받는 메소드
    public int getMembership(int index) {

        int membership = 0;
        System.out.printf("Enter a discount membership type of %d th team (no membership:0 , normal:1 , VIP:2) > ",
                index + 1); // 입력을 위한 출력 구문
        membership = sc.nextInt(); // 멤버십 종류 입력 받기

        return membership;
    }

    // 팀별 계산한 요금 출력하는 메소드
    public int calculateSum(int[] count, int membership) {

        int sum = 0;
        int[] charge = { 5000, 10000, 15000, 3000 };// 연령별 표 금액

        // 팀별 원 금액 계산하기
        for (int i = 0; i < count.length; i++) {
            sum += charge[i] * count[i];
        }

        // 멤버십 종류 별 할인 적용된 금액 계산하기
        if (membership == 1) {
            sum = sum / 100 * 90;
        } else if (membership == 2) {
            sum = sum / 100 * 80;
        }

        // 총 요금에 더하기
        total_sum += sum;

        return sum;
    }

    // 총 결과를 출력하는 메소드
    public void printResult() {
        printCount();
        System.out.println();
        printTotalSum();
    }

    // 방문객 결과를 출력하는 메소드
    public void printCount() {

        System.out.println("Total number of visitors " + total_count);
        System.out.println("Total number of child " + v_count[0]);
        System.out.println("Total number of youth " + v_count[1]);
        System.out.println("Total number of adult " + v_count[2]);
        System.out.println("Total number of old " + v_count[3]);

    }

    // 총 금액을 출력하는 메소드
    public void printTotalSum() {
        System.out.println("Total free is " + total_sum);
    }
}