package StepI;

import java.util.Scanner;

public class SubI07 {

    Scanner sc = new Scanner(System.in);

    // 메뉴를 고르는 메소드
    int SelectCan() {
        int menu = 0;

        System.out.println("1. Cola(700) 2. coffee(300) 3. lemon tea(1000) 4. milk tea(500) 5. cocoa(600)");
        System.out.print("Please select menu > ");
        menu = sc.nextInt();
        return menu;
    }

    // 진행 여부를 반환하는 메소드
    int doingYN() {
        char YesNo = 0;

        System.out.print("Do you need more menu? (Y/N) > ");
        YesNo = sc.next().charAt(0);

        return YesNo;
    }

    // 메뉴에 따른 가격을 반환하는 메소드
    int getAccount(int menu) {
        int account = 0;

        if (menu == 1) {
            account = 700;
        } else if (menu == 2) {
            account = 300;
        } else if (menu == 3) {
            account = 1000;
        } else if (menu == 4) {
            account = 500;
        } else if (menu == 5) {
            account = 600;
        }
        return account;
    }
}
