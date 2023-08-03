package StepK;

import java.util.Scanner;

public class MenuPan {

    int num[];
    String name[];
    String origin[];
    int price[];

    int count;

    Scanner sc = new Scanner(System.in);

    void getData() {
        for (int i = 0; i < count; i++) {
            System.out.printf("%d: Enter number, name, origin, price > ", i + 1);
            num[i] = sc.nextInt();
            name[i] = sc.next();
            origin[i] = sc.next();
            price[i] = sc.nextInt();
        }
    }

    void printData() {
        System.out.println("num     name     origin     price");
        for (int i = 0; i < count; i++) {
            System.out.printf("%3d     %s     %s     %d\n", num[i], name[i], origin[i], price[i]);
        }
    }

    void getNumber() {
        System.out.print("Enter number of menu > ");
        count = sc.nextInt();

        num = new int[count];
        name = new String[count];
        origin = new String[count];
        price = new int[count];
    }
}
