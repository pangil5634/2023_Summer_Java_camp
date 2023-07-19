package BaekJoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        int A, B = 0;

        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println((double) A / B);
        sc.close();
    }
}
