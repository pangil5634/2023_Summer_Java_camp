package BaekJoon;

import java.util.Scanner;

public class P1330 {
    public static void main(String[] args) {
        P1330 main = new P1330();

        main.run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A > B)
            System.out.println(">");
        else if (A < B)
            System.out.println("<");
        else if (A == B)
            System.out.println("==");
        sc.close();
    }
}
