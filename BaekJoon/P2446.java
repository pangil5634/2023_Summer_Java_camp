package BaekJoon;

import java.util.Scanner;

public class P2446 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        P2446 main = new P2446();

        main.run();
    }

    void run() {
        int count = 0; // 별의 반복 횟수를 저장하는 변수
        count = getCount(count);
        printStar(count);

    }

    // N을 입력 받는 메소드
    int getCount(int count) {
        count = sc.nextInt();
        return count;
    }

    // 별을 출력하는 메소드
    void printStar(int count) {
        int blank = 0; // 공백을 저장하는 변수
        for (int i = count; i > 1; i--) {
            for (blank = 0; blank < count - i; blank++) {
                System.out.print(" ");
            }
            for (int j = (i * 2) - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i <= count; i++) {
            for (blank = count - i; blank > 0; blank--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
