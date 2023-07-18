package StepG;

import java.util.Scanner;

class G01 {

    public static void main(String[] args) {
        G01 stepG = new G01();
        stepG.g01();
    }

    void g01() {
        G01Sub g01Sub = new G01Sub();
        Scanner sc = new Scanner(System.in);

        g01Sub.mainWhile();

        System.out.println();
        g01Sub.printAge();
        System.out.println();
        g01Sub.printResult();
        sc.close();
    }

}