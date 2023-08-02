package StepJ;

import java.util.Scanner;

public class J09 {
    public static void main(String[] args) {
        J09 stepB = new J09();
        stepB.j09();
    }

    Scanner sc = new Scanner(System.in);

    void j09() {
        SubJ09 subj09 = new SubJ09();

        System.out.print("Enter two numbers > ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.printf("%d square of %d is %d\n", n2, n1, subj09.power(n1, n2));

    }
}