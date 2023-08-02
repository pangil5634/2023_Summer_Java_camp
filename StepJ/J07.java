package StepJ;

import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {
        J07 stepB = new J07();
        stepB.j07();
    }

    Scanner sc = new Scanner(System.in);

    void j07() {
        SubJ07 subj07 = new SubJ07();

        while (true) {

            System.out.print("Enter a number. (0 for exit) > ");
            int powCount = sc.nextInt();

            if (powCount == 0) {
                break;
            }

            System.out.printf("%d square of 2 is %d\n", powCount, subj07.poweroftwo(powCount));
        }

    }
}