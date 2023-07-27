package StepH;

import java.util.Scanner;

public class H05Sub {

    Scanner sc = new Scanner(System.in);

    int getCoins(int coins) {
        System.out.print("Enter number of coins > ");
        coins = sc.nextInt();

        return coins;
    }

    int[] getNumber(int[] number) {

        for (int i = 0; i < 3; i++) {
            number[i] = (int) ((Math.random() * 9) + 1);
        }

        System.out.printf("Result of game : %d %d %d ---> ", number[0], number[1], number[2]);

        return number;
    }

    int coinsResult(int coins, int[] number) {
        if (number[0] == number[1] && number[1] == number[2]) {
            System.out.println("match 3 numbers! got four more coins");
            coins += 4;
        } else if (number[0] == number[1] || number[1] == number[2] || number[2] == number[0]) {
            System.out.println("match 2 numbers! got two more coins");
            coins += 2;
        } else {
            System.out.println("Failed...");
        }
        return coins;
    }
}