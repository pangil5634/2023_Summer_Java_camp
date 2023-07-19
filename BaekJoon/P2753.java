package BaekJoon;

import java.util.Scanner;

public class P2753 {
    public static void main(String[] args) {
        P2753 main = new P2753();

        main.run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int year = 0;

        year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println("1");
            } else if (year % 100 != 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}
