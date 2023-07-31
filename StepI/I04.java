package StepI;

import java.util.Scanner;

public class I04 {

    public static void main(String[] args) {

        I04 i04 = new I04();
        i04.run();
    }

    Scanner sc = new Scanner(System.in);

    void run() {
        int total = 0;

        while (true) {
            int menu = 0;
            menu = SelectMenu();
            if (menu == 1) {
                total += 15000;
            } else if (menu == 2) {
                total += 10000;
            } else if (menu == 3) {
                total += 7000;
            } else if (menu == 4) {
                total += 2000;
            } else if (menu == 5) {
                System.out.println("Total price is " + total);
                break;
            }
            System.out.println("Order price from now on is " + total);
            System.out.println();
        }

    }

    int SelectMenu() {
        int menu = 0;
        System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
        menu = sc.nextInt();
        return menu;
    }
}
