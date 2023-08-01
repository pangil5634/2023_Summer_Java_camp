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
        System.out.println("Find the maximum of 10 numbers");

        int max = subi05.MaxOfTen();
        System.out.println();
        System.out.println("Maximum value is " + max);

    }

}
