package StepI;

import java.util.Scanner;

public class I05 {

    public static void main(String[] args) {

        I05 i05 = new I05();
        i05.run();
    }

    Scanner sc = new Scanner(System.in);

    void run() {

        SubI05 subi05 = new SubI05();
        int Big = 0, Normal = 0, Small = 0;

        for (int i = 0; i < 10; i++) {
            byte result = subi05.GetRandom();

            if (result == 0) {
                Big++;
            } else if (result == 1) {
                Normal++;
            } else if (result == 2) {
                Small++;
            }
        }
        subi05.printResult(Big, Normal, Small);
    }

}
