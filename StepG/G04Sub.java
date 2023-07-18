package StepG;

import java.util.Scanner;

public class G04Sub {

    Scanner sc = new Scanner(System.in);

    // 사용자로부터 거래 종류를 입력 받는 메소드
    public int getKind() {
        int kind; // 거래종류(1:매매, 2:임대, 0:계산종료)

        System.out.print("Enter the type of real estate transaction(1:Trading, 2:Lease, 0:exit) > "); // 입력을 위한 출력 구문
        kind = sc.nextInt(); // 사용자로부터 거래 종류를 입력 받는다.

        return kind;
    }

    // 사용자로부터 거래 금액을 입력 받는 메소드
    public int getMoney() {
        int money = 0;// 거래금액

        System.out.print("Enter the amount of real estate transaction. > "); // 입력을 위한 출력 구문
        money = sc.nextInt(); // 사용자로부터 거래 금액을 입력 받는다.

        return money;
    }

    // 수수료 계산하는 메소드
    public int getCharge(int money, int kind) {

        int charge = 0; // 중개 수수료

        if (kind == 1) { // 매매
            if (money < 50000000) {
                charge = money / 1000 * 6;
                if (charge > 250000) {
                    charge = 250000;
                }
            } else if (money < 200000000) {
                charge = money / 1000 * 5;
                if (charge > 800000) {
                    charge = 800000;
                }
            } else {
                charge = money / 1000 * 4;
            }
        } else if (kind == 2) { // 임대
            if (money < 20000000) {
                charge = money / 1000 * 5;
                if (charge > 70000) {
                    charge = 70000;
                }
            } else if (money < 50000000) {
                charge = money / 1000 * 5;
                if (charge > 200000) {
                    charge = 200000;
                }
            } else if (money < 100000000) {
                charge = money / 1000 * 4;
                if (charge > 300000) {
                    charge = 300000;
                }
            } else {
                charge = money / 1000 * 3;
            }
        }

        // 결과 출력
        System.out.println("The charge is " + charge);

        return charge;
    }
}
