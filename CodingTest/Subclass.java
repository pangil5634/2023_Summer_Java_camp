package CodingTest;

import java.util.Scanner;

public class Subclass {

    Scanner sc = new Scanner(System.in);

    int getMode(int mode) {
        System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
        mode = sc.nextInt();
        return mode;
    }

    int getColumn(int column) {
        System.out.print("Enter a numbers of column > ");
        column = sc.nextInt();
        return column;
    }

    void printOddMode(int column) {
        for (int i = 3; i <= 9; i += 2) {
            for (int j = 1; j <= 9; j++) {
                if (j % column == 0)
                    System.out.printf("%d X %d = %d\n", i, j, i * j);
                // else if (j == 9)
                // System.out.printf("%d X %d = %d\n", i, j, i * j);
                else
                    System.out.printf("%d X %d = %-8d", i, j, i * j);
            }
            System.out.println();
        }
    }

    void printEvenMode(int column) {
        for (int i = 2; i <= 8; i += 2) {
            for (int j = 1; j <= 9; j++) {
                if (j % column == 0)
                    System.out.printf("%d X %d = %d\n", i, j, i * j);
                // else if (j == 9)
                // System.out.printf("%d X %d = %d\n", i, j, i * j);
                else
                    System.out.printf("%d X %d = %-8d", i, j, i * j);
            }
            System.out.println();
        }
    }
}
