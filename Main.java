
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.G01();
    }

    void G01() {
        Data1 data1 = new Data1();
        Scanner sc = new Scanner(System.in);

        data1.mainWhile();

        System.out.println();
        data1.printAge();
        System.out.println();
        data1.printResult();
        sc.close();
    }

}