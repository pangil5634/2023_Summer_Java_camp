package BaekJoon;

import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) {
        P10871 main = new P10871();

        main.run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int X = 0;

        count = sc.nextInt();
        X = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int Compare = sc.nextInt();
            if (Compare < X)
                System.out.print(Compare + " ");
        }
        sc.close();
    }
}
