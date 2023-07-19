package BaekJoon;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        test main = new test();

        main.run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        int A, B = 0;

        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(A * B);
        sc.close();
    }
}
