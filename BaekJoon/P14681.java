package BaekJoon;

import java.util.Scanner;

public class P14681 {
    public static void main(String[] args) {
        P14681 main = new P14681();

        main.run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        int x, y = 0;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
        sc.close();
    }
}
