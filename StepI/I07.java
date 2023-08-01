package StepI;

import java.util.Scanner;

public class I07 {

    public static void main(String[] args) {

        I07 i07 = new I07();
        i07.run();
    }

    Scanner sc = new Scanner(System.in);

    void run() {

        SubI07 subi07 = new SubI07();
        int total = 0;
        int count = 0;
        while (true) {
            int menu = subi07.SelectCan();

            total += subi07.getAccount(menu);
            count++;

            if (subi07.doingYN() == 'N') {
                break;
            }
            System.out.println();

        }

        System.out.println("Total price for 5 drinks is " + total);
    }

}
