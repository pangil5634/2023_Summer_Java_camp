package StepH;

import java.util.Scanner;

public class H05 {

    public static void main(String[] args) {
        H05 stepH = new H05();
        stepH.h05();
    }

    Scanner sc = new Scanner(System.in);

    void h05() {
        H05Sub h05sub = new H05Sub();

        int coins = 0; // 사용자의 코인 수. (최초에 입력받음)

        coins = h05sub.getCoins(coins);
        int count = 0;

        while (coins != 0) {
            count++;
            System.out.printf("Start %dth game!!! (Enter any number) > ", count);

            int dummy; // 게임스타트를 위한 의미 없는 입력 숫자
            dummy = sc.nextInt();

            int number[] = new int[3]; // 랜덤하게 만들어진 슬롯 머신의 숫자 3개의 리스트
            number = h05sub.getNumber(number);
            coins--;
            coins = h05sub.coinsResult(coins, number);

        }

    }

}