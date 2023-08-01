package StepI;

import java.util.Scanner;

public class I06 {

    public static void main(String[] args) {

        I06 i06 = new I06();
        i06.run();
    }

    Scanner sc = new Scanner(System.in);

    void run() {

        SubI06 subi06 = new SubI06();
        int Big = 0, Normal = 0, Small = 0;

        System.out.println("Generating 10 numbers...");
        for (int i = 0; i < 10; i++) {
            byte result = subi06.GetRandom();

            if (result == 0) {
                Big++;
            } else if (result == 1) {
                Normal++;
            } else if (result == 2) {
                Small++;
            }
        }
        System.out.println();
        subi06.printResult(Big, Normal, Small);
    }

}
