package StepJ;

import java.util.Scanner;

class G01 {

    public static void main(String[] args) {
        G01 stepG = new G01();
        stepG.j01();
    }

    void j01() {
        SubJ01 j01Sub = new SubJ01();
        Scanner sc = new Scanner(System.in);

        j01Sub.mainWhile();

        j01Sub.printResult();
        sc.close();
    }

}